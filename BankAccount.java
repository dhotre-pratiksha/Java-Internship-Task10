public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Oops!!! Insufficient balance... Available : ₹" + balance
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful... Remaining balance : ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }
}
