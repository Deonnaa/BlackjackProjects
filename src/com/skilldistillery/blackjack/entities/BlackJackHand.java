package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {

	public BlackJackHand() {

	}

	@Override
	public int getHandValue() {
		int value = 0;

		for (Card card : cards) {
			int cardValue = card.getValue();
			value += cardValue;
		}
		return value;
	}

	public boolean isBlackjack() {
		return cards.size() == 2 && getHandValue() == 21;
	}

	public boolean isBust() {
		return getHandValue() > 21;
	}

	// No Aces or Aces counted as 1
	public boolean isHard() {
		for (Card card : cards) {
			if (card.getValue() == 11) {
				return false;
			}
		}
		return true;
	}

	// At least one Ace counted as 11
	public boolean isSoft() {
		for (Card card : cards) {
			if (card.getValue() == 11) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
