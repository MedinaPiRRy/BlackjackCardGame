
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
import java.util.Scanner;

public class BlackjackGame extends Game {

    Dealer dl = new Dealer();
    private BlackjackDeck deck;
    private BlackjackPlayer player;
    private Dealer dealer;

    private boolean checkForBlackjack(BlackjackPlayer player) {
        return player.getHandValue() == 21;
    }
    
    public BlackjackGame() {
        deck = new BlackjackDeck();
        player = new BlackjackPlayer("Player");
        dealer = new Dealer();
    }

    @Override
    public void play() {
        System.out.println("Welcome to Blackjack!");

        start();
        boolean continuePlaying = true;
        Scanner scanner = new Scanner(System.in);

        dl.dealInitialCards(player, deck);

        System.out.println("\nYour hand: " + player.getHand().toString());

        while (continuePlaying) {
            dl.dealInitialCards(player, deck);

            System.out.println("\nYour hand: " + player.getHand().toString());

            if (checkForBlackjack(player)) {
                endRound("Player");
            } else {
                dl.dealInitialCards(dealer, deck);
                System.out.println("Dealer's up card: " + dealer.getHand().getCard(0));

                boolean playerTurn = true;
                while (playerTurn) {
                    System.out.println("Do you want to hit or stand? (h/s)");
                    String choice = scanner.next().toLowerCase();

                    if ("h".equals(choice)) {
                        player.hit(deck);
                        System.out.println("\nYour hand: " + player.getHand().toString());
                        if (player.getHandValue() > 21) {
                            playerTurn = false;
                            endRound("Player");
                        }
                    } else if ("s".equals(choice)) {
                        playerTurn = false;
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                  }
                }
              }
              scanner.close();
            }
          }

               

