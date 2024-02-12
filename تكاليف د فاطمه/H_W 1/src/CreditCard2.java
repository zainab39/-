//12-Modify the CreditCard class from Code Fragment 1.5 so that it ignores any request
//to process a negative payment amount.
public class CreditCard2 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard2(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount < 0) {
            return; // Ignore negative payment amount
        }
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
        CreditCard2 card = new CreditCard2("Zainab Hussein", "Bank of Yaman", "1234 5678 9012 3456", 5000, 1000);
        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.println("Limit: $" + card.getLimit());
        System.out.println("Balance: $" + card.getBalance());

        card.makePayment(200);
        System.out.println("Updated Balance: $" + card.getBalance());

        card.makePayment(-100); // Ignored
        System.out.println("Balance after Ignored Payment: $" + card.getBalance());
    }
}