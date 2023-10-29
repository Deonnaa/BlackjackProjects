package com.skilldistillery.blackjack.test;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		BlackJackApp bjApp = new BlackJackApp();
		bjApp.run();
	}

	public void run() {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			Dealer dealer = new Dealer();
			Player player = new Player();

			System.out.println("♥♣ Welcome to BlackJack! ♦♠");

			dealer.shuffleDeck();

			// Hardcode a 21 for the player
//		player1.addCardToHand(new Card("♥ hearts ♥", "KING"));
//		player1.addCardToHand(new Card("♥ hearts ♥", "KING"));

			// Deal two cards to the player and two cards to the dealer
			player.addCardToHand(dealer.dealCard());

			Card dealerHiddenCard = dealer.dealCard();
			dealerHiddenCard.setFaceUp(false); // Hide the dealer's second card
			dealer.addCardToHand(dealerHiddenCard);

			player.addCardToHand(dealer.dealCard());
			dealer.addCardToHand(dealer.dealCard());

			// Display the initial hands
			int playerTotal = player.getHand().getHandValue();

			System.out.println("Player's Hand: " + playerTotal);
			System.out.println(player.getHand());

			System.out.println("Dealer's Hand: ");
			System.out.println(dealer.getHand());

			if (playerTotal == 21) {
				System.out.println("BlackJack!\n");
				continue; // This will jump to the start of the outer loop, start new game.
							
			}

			// Player's turn
			while (true) {
				System.out.print("Do you want to Hit or Stand? (H/S): ");
				String choice = scanner.nextLine().toUpperCase();
				System.out.println(" ");

				if ("H".equalsIgnoreCase(choice)) {
					Card card = dealer.dealCard();
					player.addCardToHand(card);
					playerTotal = player.getHand().getHandValue();
					System.out.println("Player Drew: " + card.getValue() + " " + card.getSuit() + "\n");
					System.out.println("Player's Hand: " + playerTotal);
					System.out.println(player.getHand());

					if (playerTotal == 21) {
						System.out.println("BlackJack!\n");
						break; // This will jump to the start of the outer loop, start new game
					}

					if (playerTotal > 21) {
						System.out.println("Player Busted! Better Luck Next Time.");
						break; // Exit the run() method and end the game
					}
				} else if ("S".equalsIgnoreCase(choice)) {
					break; // Exit the loop if the player chooses to stand
				}
			}

			// Dealer's turn
			int dealerTotal = dealer.getHand().getHandValue();
			System.out.println("Dealer's Turn");
			dealerHiddenCard.setFaceUp(true); // Flip the dealer's hidden card
			System.out.println("Dealer's hidden card was: " + dealerHiddenCard);
			while (dealer.getHand().getHandValue() < 17) {
				Card card = dealer.dealCard();
				dealer.addCardToHand(card);
				System.out.println("Dealer Drew: " + +card.getValue() + " " + card.getSuit() + "\n");
			}
			System.out.println("Dealer's Hand: " + dealer.getHand().getHandValue());
			System.out.println(dealer.getHand());

			// Determine the Winner
			dealerTotal = dealer.getHand().getHandValue();
			playerTotal = player.getHand().getHandValue();
			if (playerTotal > 21) {
				System.out.println("Player Busted! Dealer Wins.");
			} else if (dealerTotal > 21) {
				System.out.println("Dealer Busted! Player Wins.");
			} else if (playerTotal > dealerTotal) {
				System.out.println("Player Wins!");
			} else if (dealerTotal > playerTotal) {
				System.out.println("Dealer Wins!");
			} else {
				System.out.println("It's a Tie!");
			}

			System.out.print("\nWould you like to play again? (Y/N): ");
			String playAgainChoice = scanner.nextLine().toUpperCase();
			if (!"Y".equalsIgnoreCase(playAgainChoice)) {
				break;
			}
		}
		System.out.println("Thanks for playing!");
		scanner.close();
	}
}
