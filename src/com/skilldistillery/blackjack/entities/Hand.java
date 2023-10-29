package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}

	public void addCard(Card card) {
		cards.add(card); // Adds single Card obj to end of list
	}

	public void clear() {
		cards.clear();
	}

	public abstract int getHandValue();

	// Need more clarification
	public String toString() {
		StringBuilder handString = new StringBuilder();
		for (Card card : cards) {
			handString.append(card.toString()).append("\n");
		}
		return handString.toString();
	}
	
	public void flipAllCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

}
