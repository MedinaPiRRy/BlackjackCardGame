
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
public class BlackjackPlayer extends Player {

    // creates blackjack player
    public BlackjackPlayer(String name) {
        super(name);
    }

    // lets player get a card
    public void hit(BlackjackDeck deck) {
        getHand().addCard(deck.drawCard());
    }

    // calculates the value from the hand
    public int getHandValue() {
        int handValue = 0;
        int aces = 0;
        for (Card card : getHand().getCards()) {
            handValue += card.getValue().getValue();
            if (card.getValue() == Value.ACE) {
                aces++;
            }
        }

        /* this while loop makes sure that
        the user is using the aces in the most favorable way for the player */
        while (handValue > 21 && aces > 0) {
            handValue -= 10;
            aces--;
        }
        return handValue;
    }
}
