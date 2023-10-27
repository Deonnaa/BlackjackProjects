package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		this.deck = deck;
		initializeDeck();
	}

	// Iterate through all of the Suits
	// Nested loop for all the ranks in each suit
	// Add cards Card class with (suit,rank)
	private void initializeDeck() {
		// Example 1
//		for (Suit suit : Suit.values()) {
//			for (Rank rank : Rank.values()) {
//				deck.add(new Card(suit, rank));
//			}
//		}

		// Example 2
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();

		for (Rank rank : ranks) {
			for (Suit suit : suits) {
				Card aCard = new Card(suit, rank);
				deck.add(aCard);
			}
		}
	}

	public int checkDeckSize() {
		return deck.size();
	}

	// If deck is not empty, remove/deal top card
	public Card dealCard() {
//		Example 1
		if (!deck.isEmpty()) {
			return deck.remove(deck.size() - 1);
		}
		return null;

//		Example 2
//		Card someCardFromDeck = null;
//		someCardFromDeck = deck.remove(0);
//		return someCardFromDeck;
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

}
