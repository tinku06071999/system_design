package solid_design_principal.LiskowSubsitutionPrincipal;

public class CurrentAccountLSP implements Withdrawable {
    private double balance;
    private String accountNumber;

    public CurrentAccountLSP(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

}
