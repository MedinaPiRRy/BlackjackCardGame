
package ca.sheridancollege.project;

/**
 *
 * @author MedinaPiRRy
 */
public abstract class Player {

    // variables for player
    private String name;
    private Hand hand;

    // creates player object
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    // gets player name - not used
    public String getName() {
        return name;
    }

    // sets player name
    public void setName(String name) {
        this.name = name;
    }

    // gets hand
    public Hand getHand() {
        return hand;
    }

}
