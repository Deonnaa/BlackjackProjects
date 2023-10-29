package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("♥ hearts ♥"), SPADES("♠ spades ♠"), CLUBS("♣ clubs ♣ "), DIAMONDS("♦ diamonds ♦");

	private String suitName;

	Suit(String suitName) {
		this.suitName = suitName;
	}

	@Override
	public String toString() {
		return suitName;
	}

}
