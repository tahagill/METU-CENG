/**
 * Represents a bank account with functionalities such as deposit, withdrawal, balance retrieval,
 * setting transaction fee, and deducting monthly charges.
 */
public class BankAccount {

    private double balance;
    private double charge;
    private int numTransactions;
    private final int freeTransactions;

    /**
     * Constructs a BankAccount object with the given initial balance and allowed free transactions.
     *
     * @param initialBalance   The initial balance of the bank account.
     * @param freeTransactions The number of free transactions allowed per month.
     */
    public BankAccount(double initialBalance, int freeTransactions) {
        this.balance = initialBalance;
        this.numTransactions = 0;
        this.freeTransactions = freeTransactions;
        this.charge = 0;
    }

    /**
     * Constructs a BankAccount object with zero initial balance and allowed free transactions.
     *
     * @param freeTransactions The number of free transactions allowed per month.
     */
    public BankAccount(int freeTransactions) {
        this.balance = 0.0;
        this.numTransactions = 0;
        this.freeTransactions = freeTransactions;
        this.charge = 0;
    }

    /**
     * Deposits the specified amount into the bank account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        this.balance += amount;
        this.numTransactions++;
    }

    /**
     * Withdraws the specified amount from the bank account if sufficient balance is available.
     *
     * @param amount The amount to withdraw.
     * @return True if the withdrawal was successful, false otherwise.
     */
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            this.numTransactions++;
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Sets the transaction fee for exceeding free transactions.
     *
     * @param fee The transaction fee to set.
     */
    public void setTransactionFee(double fee) {
        if (fee > 0) {
            this.charge = fee;
        } else {
            System.out.println("Transaction fee must be greater than zero.");
        }
    }

    /**
     * Deducts the monthly charge based on exceeding free transactions and resets the transaction count.
     */
    public void deductMonthlyCharge() {
        int excessTransactions = Math.max(this.numTransactions - this.freeTransactions, 0);
        double monthlyCharge = excessTransactions * this.charge;
        this.balance -= monthlyCharge;
        this.numTransactions = 0; // Reset transaction count for next month
    }
}
