package com.skilldistillery.blackjack.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Rank;
import com.skilldistillery.blackjack.entities.Suit;

public class BlackJackHandTest {

	@Test
	public void testHandValueForBlackjack() {
		BlackJackHand hand = new BlackJackHand();

		// Blackjack Test
		hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
		hand.addCard(new Card(Suit.SPADES, Rank.KING));

		Assertions.assertEquals(21, hand.getHandValue(), "Should be 21 for a Blackjack.");
	}

	@Test
	public void testHandValueNotBlackjack() {
		BlackJackHand hand = new BlackJackHand();

		// Not result in blackjack.
		hand.addCard(new Card(Suit.HEARTS, Rank.TEN));
		hand.addCard(new Card(Suit.SPADES, Rank.NINE));

		Assertions.assertNotEquals(21, hand.getHandValue(), "Should not 21.");
	}
}