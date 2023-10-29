package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Player {
	protected Hand hand;

	public Player() {
		hand = new BlackJackHand();
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);
	}

	public void clearHand() {
		hand.clear();
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void flipCardOver() {
		hand.flipAllCards();
	}

}
