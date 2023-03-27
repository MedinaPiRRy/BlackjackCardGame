
package ca.sheridancollege.project;

/**
 *
 * @author MedinaPiRRy
 */
import java.util.ArrayList;
import java.util.List;

public abstract class GroupOfCards {

    // creates list of cards
    private List<Card> cards;

    // puts card's list in GroupOfCards object
    public GroupOfCards() {
        this.cards = new ArrayList<>();
    }

    // lets user add a card to cards list
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

    // to get the cards
    public List<Card> getCards() {
        return cards;
    }

    // return size of cards (no their values)
    public int size() {
        return cards.size();
    }

}
