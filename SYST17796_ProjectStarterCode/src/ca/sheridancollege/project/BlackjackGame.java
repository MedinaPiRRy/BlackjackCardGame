
package ca.sheridancollege.project;

/**
 *
 * @author ecemgulec
 * @author MedinaPiRRy
 */
import java.util.Scanner;

public class BlackjackGame extends Game {

    // create dealer object and initialize variables
    Dealer dl = new Dealer();
    private boolean PlayerBusted = false;
    private BlackjackDeck deck;
    private BlackjackPlayer player;
    private Dealer dealer;
    
    // set BlackJackGame objects
    public BlackjackGame() {
        deck = new BlackjackDeck();
        player = new BlackjackPlayer("Player");
        dealer = new Dealer();
    }

    Betting money = new Betting(200);
    public double bet;

    @Override
    public void play() {
        System.out.println("Welcome to Blackjack!");

        // starts blackjack game
        start();
        boolean continuePlaying = true;
        boolean playerTurn = true;
        Scanner scanner = new Scanner(System.in);

        // set player's name
        System.out.println("What's the player's name: ");
        String pName = scanner.nextLine();
        player.setName(pName);
        System.out.println("Welcome " + pName);
        System.out.println("Your total amount of money is: " + money.getMoney());

        // dealer initializes both the user's and its own hand
        dl.dealInitialCards(player, deck);
        System.out.println("\n" + pName + "'s hand: " + player.getHand().toString());

        dl.dealInitialCards(dealer, deck);
        System.out.println("Dealer's up card: " + dealer.getHand().getCard(0));

        System.out.println("How much would you like to bet? ");
        bet = scanner.nextDouble();
        money.addBet(bet);
        System.out.println("Your bet was: " + money.getBet());
        System.out.println("Total amount of money: " + money.getMoney());

        // loop to continue playing
        while (continuePlaying) {
            playerTurn = true;

                // while player can still make a move
                while (playerTurn) {
                    System.out.println("Do you want to hit or stand? (h/s)");
                    String choice = scanner.next().toLowerCase();

                    // "h" to hit and continue game, "s" to stand and stop game
                    if ("h".equals(choice)) {
                        player.hit(deck);
                        System.out.println("\n" + pName + "'s hand: " + player.getHand().toString());
                        System.out.println("How much would you like to bet? ");
                        bet = scanner.nextDouble();
                        money.addBet(bet);
                        System.out.println("Your bet was: " + money.getBet());
                        System.out.println("Total amount of money: " + money.getMoney());

                        /* if player's hand value is over 21, player looses the game automatically
                        this is because dealer can't never go over 21 with only two cards */
                        if (player.getHandValue() > 21) {
                            playerTurn = false;
                            continuePlaying = false;
                            PlayerBusted = true;
                            endRound(pName);
                        }
                        } else if ("s".equals(choice)) {
                            playerTurn = false;
                            continuePlaying = false;
                        } else {
                            System.out.println("Invalid choice. Please try again.");
                        }
                  }
            }

        // if player lost statement
        if (PlayerBusted) {
            System.out.println("\nSorry, you lost :( )");
            System.out.println(pName + "'s final hand: " + player.getHand().toString());
            System.out.println("Deck's value: " + player.getHandValue());
            System.out.println("Dealer's final hand was: " + dealer.getHand().toString());
            System.out.println("Dealer's final value was: " + dealer.getHandValue());
            System.out.println("Total amount of money: " + money.getMoney());
        } 
            // if player is closer to 21
            else if (player.getHandValue() > dealer.getHandValue()) {
                System.out.println("\nCongratulations, You Won!! )");
                System.out.println(pName + "'s final hand: " + player.getHand().toString());
                System.out.println("Deck's value: " + player.getHandValue());
                System.out.println("Dealer's final hand was: " + dealer.getHand().toString());
                System.out.println("Dealer's final value was: " + dealer.getHandValue());
                money.setMoney(money.getMoney() + (money.getBet()*2));
                System.out.println("Total amount of money: " + money.getMoney());
            } 
            // if player's hand and dealer's hand have same value
            else if (player.getHandValue() == dealer.getHandValue()) {
                System.out.println("\nGame was a draw ---");
                System.out.println(pName + "'s final hand: " + player.getHand().toString());
                System.out.println("Deck's value: " + player.getHandValue());
                System.out.println("Dealer's final hand was: " + dealer.getHand().toString());
                System.out.println("Dealer's final value was: " + dealer.getHandValue());
                money.setMoney(money.getMoney() + (money.getBet()/2));
                System.out.println("Total amount of money: " + money.getMoney());
            }
        
            // else user lost
            else {
                System.out.println("\nSorry, you lost :( )");
                System.out.println(pName + "'s final hand: " + player.getHand().toString());
                System.out.println("Deck's value: " + player.getHandValue());
                System.out.println("Dealer's final hand was: " + dealer.getHand().toString());
                System.out.println("Dealer's final value was: " + dealer.getHandValue());
                System.out.println("Total amount of money: " + money.getMoney());
            }

        // ends game
        end();
        scanner.close();
    }
}

               

