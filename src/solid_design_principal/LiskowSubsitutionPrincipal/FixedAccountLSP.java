package solid_design_principal.LiskowSubsitutionPrincipal;

public class FixedAccountLSP implements NonWithdrable {
    private double balance;
    private int termInMonths;
    private String accountNumber;

    public FixedAccountLSP(String accountNumber,double initialBalance, int termInMonths) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.termInMonths = termInMonths;
    }

    public double getBalance() {
        return balance;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

}
