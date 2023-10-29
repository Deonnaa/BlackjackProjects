package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {
	private Suit suit;
	private Rank rank;
	private boolean isFaceUp;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
		this.isFaceUp = true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		return isFaceUp ? rank + " of " + suit : "[Face Down Card]";
	}

	public int getValue() {
		return rank.getValue();
	}
	
	public void setValue() {
        this.isFaceUp = isFaceUp;
    }

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}
	
	public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
    }

}
