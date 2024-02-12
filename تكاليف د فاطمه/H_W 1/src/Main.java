//13-Modify the declaration of the first for loop in the main method in Code Fragment
// 1.6 so that its charges will cause exactly one of the three credit cards to attempt
// to go over its credit limit. Which credit card is it?
public class Main {
    public static void main(String[] args) {
            CreditCard2[] wallet = new CreditCard2[3];
            wallet[0] = new CreditCard2("Zainab Hussein", "Bank of Yaman", "1234 5678 9012 3456", 5000, 1000);
            wallet[1] = new CreditCard2("zahra", "Sanaa", "9876 5432 1098 7654", 3500, 500);
            wallet[2] = new CreditCard2("maria", "Taiz", "2468 1357 8024 6802", 2000, 100);

            for (int val = 1; val <= 16; val++) {
                wallet[0].charge(100);  // Charging to the first credit card
                wallet[1].charge(200);  // Charging to the second credit card
                wallet[2].charge(300);  // Charging to the third credit card
            }

            for (CreditCard2 card : wallet) {
                System.out.println("Customer: " + card.getCustomer());
                System.out.println("Bank: " + card.getBank());
                System.out.println("Account: " + card.getAccount());
                System.out.println("Limit: $" + card.getLimit());
                System.out.println("Balance: $" + card.getBalance());
                System.out.println();
            }
        }
    }
