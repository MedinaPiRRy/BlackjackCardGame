
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
import java.util.ArrayList;
import java.util.List;

public class Hand {

    // creates list of cards
    private List<Card> cards;

    // creates hand object with cards list
    public Hand() {
        cards = new ArrayList<>();
    }

    // lets user add card from cards list
    public void addCard(Card card) {
        cards.add(card);
    }

    // lets user remove card from cards list
    public Card removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.remove(index);
        }
        return null;
    }

    // getters for cards and list of cards
    public Card getCard(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.get(index);
        }
        return null;
    }

    public List<Card> getCards() {
        return cards;
    }

    // lets user read cards
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append(", ");
        }
        return sb.toString().substring(0, sb.length() - 2);
    }
}
