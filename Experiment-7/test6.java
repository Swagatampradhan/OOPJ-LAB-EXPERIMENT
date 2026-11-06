class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal of Rs. " + amount + " failed! Current balance is only Rs. " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal of Rs. " + amount + " successful. Remaining balance: Rs. " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class test6 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        System.out.println("Initial Account Balance: Rs. " + account.getBalance());

        try {
            System.out.println("\nTransaction 1: Withdrawing Rs. 2000...");
            account.withdraw(2000.0);

            System.out.println("\nTransaction 2: Withdrawing Rs. 4000...");
            account.withdraw(4000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

