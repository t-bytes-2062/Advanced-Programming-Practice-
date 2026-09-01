import accounts.*;
import payments.*;

public class Main {
    public static void main(String[] args) {

        Account account;

        account = new SavingsAccount("SB101", "Tanish", 25000);
        account.displayDetails();

        System.out.println();

        account = new CurrentAccount("CA102", "Rahul", 40000);
        account.displayDetails();

        System.out.println();

        Payment payment;

        payment = new UPIPayment();
        payment.pay(5000);

        UPIPayment upi = new UPIPayment();
        upi.verifyPayment();

        payment = new CardPayment();
        payment.pay(3000);

        System.out.println();

        System.out.println("UPI is online transaction: "
                + (upi instanceof OnlineTransaction));

        CardPayment card = new CardPayment();

        System.out.println("Card is online transaction: "
                + (card instanceof OnlineTransaction));
    }
}
