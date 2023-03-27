
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
import java.util.Scanner;

public class BlackjackGame extends Game {

    Dealer dl = new Dealer();
    private boolean PlayerBusted = false;
    private BlackjackDeck deck;
    private BlackjackPlayer player;
    private Dealer dealer;
    
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

        dl.dealInitialCards(dealer, deck);
        System.out.println("Dealer's up card: " + dealer.getHand().getCard(0));

        while (continuePlaying) {
            boolean playerTurn = true;
                while (playerTurn) {
                    System.out.println("Do you want to hit or stand? (h/s)");
                    String choice = scanner.next().toLowerCase();

                    if ("h".equals(choice)) {
                        player.hit(deck);
                        System.out.println("\nYour hand: " + player.getHand().toString());
                        if (player.getHandValue() > 21) {
                            playerTurn = false;
                            continuePlaying = false;
                            PlayerBusted = true;
                            endRound("Player");
                        }
                    } else if ("s".equals(choice)) {
                        playerTurn = false;
                        continuePlaying = false;
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                  }
        }

        if (PlayerBusted) {
            System.out.println("\nSorry, you lost :( )");
            System.out.println("Your final hand: " + player.getHand().toString());
            System.out.println("Deck's value: " + player.getHandValue());
            System.out.println("Dealer's final hand was: " + dealer.getHand().toString());
            System.out.println("Dealer's final value was: " + dealer.getHandValue());
        } else if (player.getHandValue() > dealer.getHandValue()) {
            System.out.println("\nCongratulations, You Won!! )");
            System.out.println("Your final hand: " + player.getHand().toString());
            System.out.println("Deck's value: " + player.getHandValue());
            System.out.println("Dealer's final hand was: " + dealer.getHand().toString());
            System.out.println("Dealer's final value was: " + dealer.getHandValue());
        } else {
            System.out.println("\nSorry, you lost :( )");
            System.out.println("Your final hand: " + player.getHand().toString());
            System.out.println("Deck's value: " + player.getHandValue());
            System.out.println("Dealer's final hand was: " + dealer.getHand().toString());
            System.out.println("Dealer's final value was: " + dealer.getHandValue());
        }

        end();
        scanner.close();
    }
}

               

