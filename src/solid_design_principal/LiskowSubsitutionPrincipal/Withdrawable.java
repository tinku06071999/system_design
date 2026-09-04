package solid_design_principal.LiskowSubsitutionPrincipal;

public interface Withdrawable extends NonWithdrable {
    void withdraw(double amount);
    @Override
    void deposit(double amount);
}
