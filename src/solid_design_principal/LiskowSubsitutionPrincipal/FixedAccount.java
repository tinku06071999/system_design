package solid_design_principal.LiskowSubsitutionPrincipal;
//Liskov Substitution Principle states that objects of a superclass should be
// replaceable with objects of a subclass without affecting the correctness of the program.
// In this example, we have an Account interface and three implementations: SavingAccount,
// CurrentAccount, and FixedAccount. The FixedAccount class violates the Liskov Substitution
// Principle because it does not behave like a regular account in terms of withdrawal. It throws an
// exception if someone tries to withdraw before the term ends, which is not expected behavior for an account.
// This can lead to unexpected behavior and bugs in the code that uses the Account interface, as it assumes that
// all implementations of the interface will behave in a similar manner.
// to fix this violation, we can create a separate interface for FixedAccount that does not include the withdraw method,
// or we can create a separate class for FixedAccount that does not implement the Account interface.
//or  we can create two type of interfaces, one for withdrawable accounts and one for non-withdrawable accounts.
// This way, we can ensure that the FixedAccount class does not violate the Liskov Substitution Principle.
//Non withdrable interface will only have deposit method and withdraable interface will implments this implemet and
// withdrable interface have withdraw method as well. This way, we can ensure that the FixedAccount class does not
// violate the Liskov Substitution Principle.



// violation of LSP
public class FixedAccount implements Account {
    private double balance;
    private int termInMonths;
    private String accountNumber;

    public FixedAccount(double initialBalance, int termInMonths, String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.termInMonths = termInMonths;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
//we can withdraw only after the term ends, so we throw an exception if someone tries to withdraw before the term ends
// this is violation of Liskov Substitution Principle because FixedAccount is a subtype of Account, but it does not
// behave like a regular account in terms of withdrawal.
    @Override
    public void withdraw(double amount) {
        if (termInMonths > 0) {
            throw new UnsupportedOperationException("Withdrawals are not allowed before the term ends.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    public void decreaseTerm() {
        if (termInMonths > 0) {
            termInMonths--;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getTermInMonths() {
        return termInMonths;
    }
}



