package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Rank;
import com.skilldistillery.blackjack.entities.Suit;

public class BlackJackHandTest {

    @Test
    public void testHandValueForBlackjack() {
        // Create a new blackjack hand
        BlackJackHand hand = new BlackJackHand();
        
        // Add two cards to the hand that should result in blackjack: Ace and a King
        hand.addCard(new Card(Suit.HEARTS, Rank.ACE));
        hand.addCard(new Card(Suit.SPADES, Rank.KING));
        
        // Assert that the value of the hand is 21 (blackjack)
        Assertions.assertEquals(21, hand.getHandValue(), "The hand value should be 21 for a blackjack.");
    }

    @Test
    public void testHandValueNotBlackjack() {
        // Create a new blackjack hand
        BlackJackHand hand = new BlackJackHand();
        
        // Add two cards to the hand that do not result in blackjack
        hand.addCard(new Card(Suit.HEARTS, Rank.TEN));
        hand.addCard(new Card(Suit.SPADES, Rank.NINE));
        
        // Assert that the value of the hand is not 21
        Assertions.assertNotEquals(21, hand.getHandValue(), "The hand value should not be 21.");
    }
}
