
package ca.sheridancollege.project;

/**
 * 
 * @author ecemgulec
 * @author MedinaPiRRy 
 */
import java.util.Collections;

public class BlackjackDeck extends GroupOfCards {
    public BlackjackDeck() {
        super();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                this.addCard(new Card(suit, value));
            }
        }
        shuffle();
    }

    public Card drawCard() {
        return removeCard(0);
    }

    public void shuffle() {
        Collections.shuffle(this.getCards());
    }
}
