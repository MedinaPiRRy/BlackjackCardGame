
package ca.sheridancollege.project;

/**
 * 
 * @author ecemgulec
 * @author MedinaPiRRy 
 */
import java.util.Collections;

public class BlackjackDeck extends GroupOfCards {
    
    // to create blackjack's deck
    public BlackjackDeck() {
        super();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                this.addCard(new Card(suit, value));
            }
        }
        shuffle();
    }

    // allows user to draw card from group of cards
    public Card drawCard() {
        return removeCard(0);
    }

    // shuffles all cards
    public void shuffle() {
        Collections.shuffle(this.getCards());
    }
}
