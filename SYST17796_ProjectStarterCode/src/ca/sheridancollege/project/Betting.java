package ca.sheridancollege.project;
/**
 * 
 * @author MedinaPiRRy 
 */
import java.util.Scanner;

public class Betting {
    private double money;
    private double bet;

    public Betting(double money) {
        this.money = money;
    }

    public double addBet(double bet) {
        Scanner scanner = new Scanner(System.in);
        if (bet > this.money) {
            System.out.println("You cannot bet more than what you have...");
            System.out.println("Enter new bet: ");
            bet = scanner.nextDouble();
            this.money -= bet;
            this.bet += bet;
        } else {
            this.money -= bet;
            this.bet += bet;
        }
        return money;
    }

    public double getBet() {
        return bet;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double fMoney) {
        this.money = fMoney;
    }

}
