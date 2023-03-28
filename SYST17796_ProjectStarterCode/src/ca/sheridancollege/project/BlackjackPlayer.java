
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
            if (card.getValue() != Value.ACE) {
                handValue += card.getValue().getValue();
            } else if (card.getValue() == Value.ACE) {
                aces++;
            }
        }
         /*
         * this if-statement makes sure that
         * the user is using the aces in the most favorable way for the player
         */
        int tempHandValue = 0;
        if (aces >= 2) {
            handValue += aces;
        } else if (aces == 1) {
            tempHandValue = handValue + 11;
            if (tempHandValue < 21) {
                handValue += 11;
            } else {
                handValue += 1;
            }
        }
        return handValue;
    }
}
