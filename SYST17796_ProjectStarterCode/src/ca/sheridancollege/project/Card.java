
package ca.sheridancollege.project;

/**
 *
 * @author dancye
 * @author MedinaPiRRy
 */
public class Card {

    // card variables
    private final Suit suit;
    private final Value value;

    // makes a card object with Suit and Value as parameters
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    // getters for Suit and Value
    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    // toString to read the cards
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}

