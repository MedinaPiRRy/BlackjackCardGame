
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
public class BlackjackPlayer extends Player {
    public BlackjackPlayer(String name) {
        super(name);
    }

    public void hit(BlackjackDeck deck) {
        getHand().addCard(deck.drawCard());
    }

    public int getHandValue() {
        int handValue = 0;
        int aces = 0;
        for (Card card : getHand().getCards()) {
            handValue += card.getValue().getValue();
            if (card.getValue() == Value.ACE) {
                aces++;
            }
        }

        while (handValue > 21 && aces > 0) {
            handValue -= 10;
            aces--;
        }
        return handValue;
    }
}
