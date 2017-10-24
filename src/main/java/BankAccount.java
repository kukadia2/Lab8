//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * A type of bank account.
     */
    public enum BankAccountType {
        /**
         * A checkings account.
         */
        CHECKINGS,
        /**
         * A savings account.
         */
        SAVINGS,
        /**
         * A student account.
         */
        STUDENT,
        /**
         * A workplace account.
         */
        WORKPLACE
    }
    /**
     * The account number.
     */
    private int accountNumber;
    /**
     * The account type.
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public BankAccountType accountType;
    /**
     * The account balance.
     */
    private double accountBalance;
    /**
     * The owner's name.
     */
    private String ownerName;
    /**
     * The interest rate.
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public double interestRate;
    /**
     * The interest earned.
     */
    private double interestEarned;

    /**
     * Creates a bank account.
     * @param name the owner's name.
     * @param accountCategory the bank account type.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * Getter method.
     * @return the account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter method.
     * @return the bank account type.
     */
    public BankAccountType getBankAccountType() {
        return accountType;
    }

    /**
     * Getter method.
     * @return the account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Getter method.
     * @return the owner's name.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Getter method.
     * @return the interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Getter method.
     * @return the interest earned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Setter method.
     * @param a the account number
     */
    public void setAccountNumber(final int a) {
        accountNumber = a;
    }

    /**
     * Setter method.
     * @param b the bank account type.
     */
    public void setBankAccountType(final BankAccountType b) {
        accountType = b;
    }

    /**
     * Setter method.
     * @param a the account balance.
     */
    public void setAccountBalance(final double a) {
        accountBalance = a;
    }

    /**
     * Setter method.
     * @param o the owner name.
     */
    public void setOwnerName(final String o) {
        ownerName = o;
    }

    /**
     * Setter method.
     * @param i the interest rate.
     */
    public void setInterestRate(final double i) {
        interestRate = i;
    }

    /**
     * Setter method.
     * @param i the interest earned.
     */
    public void setInterestEarned(final double i) {
        interestEarned = i;
    }
}
