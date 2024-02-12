//11-Modify the CreditCard class from Code Fragment 1.5 to include a method that updates the credit limit.
public class creditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public creditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public void updateCreditLimit(int newLimit) {
        limit = newLimit;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        creditCard card = new creditCard("Zainab Hussein", "Bank of Yaman", "1234 5678 9012 3456", 5000, 1000);
        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.println("Limit: $" + card.getLimit());
        System.out.println("Balance: $" + card.getBalance());

        card.updateCreditLimit(6000);
        System.out.println("Updated Limit: $" + card.getLimit());
    }
}
