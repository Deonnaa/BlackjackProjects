package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck;

	public Dealer() {
		deck = new Deck();
	}

	public void shuffleDeck() {
		deck.shuffle();
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
}
