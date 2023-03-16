
package ca.sheridancollege.project;

/**
 *
 * @author MedinaPiRRy
 */
import java.util.ArrayList;
import java.util.List;

public abstract class GroupOfCards {
    private List<Card> cards;

    public GroupOfCards() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.remove(index);
        }
        return null;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int size() {
        return cards.size();
    }

    public abstract void shuffle();
}
