
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
public enum Suit {
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    SPADES("Spades");

    // creates variable "name" to later be returned with toString()
    private final String name;

    Suit(String name) {
        this.name = name;
    }

    // reads suit
    @Override
    public String toString() {
        return name;
    }
}

