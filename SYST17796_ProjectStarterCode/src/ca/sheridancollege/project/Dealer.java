
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
public class Dealer extends BlackjackPlayer {

    // dealer object, creates dealer with name "Dealer"
    public Dealer() {
        super("Dealer");
    }

    // dealer deals first two cards to start the game
    public void dealInitialCards(BlackjackPlayer player, BlackjackDeck deck) {
        for (int i = 0; i < 2; i++) {
            player.hit(deck);
            this.hit(deck);
        }
    }
}
