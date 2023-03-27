
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
public class Dealer extends BlackjackPlayer {
    public Dealer() {
        super("Dealer");
    }

    public void dealInitialCards(BlackjackPlayer player, BlackjackDeck deck) {
        for (int i = 0; i < 2; i++) {
            player.hit(deck);
            this.hit(deck);
        }
    }
}
