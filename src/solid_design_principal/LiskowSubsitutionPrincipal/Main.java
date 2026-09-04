package solid_design_principal.LiskowSubsitutionPrincipal;

public class Main {
    public static void main(String[] args){
        // Before LSP not follow
        System.out.println("Before LSP not follow");
       CurrentAccount currentAccount = new CurrentAccount("123456");
       currentAccount.deposit(1000);
       currentAccount.withdraw(500);
       System.out.println("Current Account Balance: " + currentAccount.getBalance());
       SavingAccount savingAccount = new SavingAccount("654321");
       savingAccount.deposit(2000);
       savingAccount.withdraw(1000);
       System.out.println("Saving Account Balance: " + savingAccount.getBalance());

       // Before LSP not follow
       FixedAccount fixedAccount = new FixedAccount(250, 12, "98912");
       fixedAccount.deposit(3000);
//       fixedAccount.withdraw(1500); // throw an error because FixedAccount does not implement withdraw method
       System.out.println("Fixed Account Balance: " + fixedAccount.getBalance());

       // After LSP follow
        System.out.println("\nAfter LSP follow");
         FixedAccountLSP fixedAccountLSP = new FixedAccountLSP("98912", 250, 12);
         fixedAccountLSP.deposit(3000);
         // fixedAccountLSP.withdraw(1500); // This line would cause a compile-time error since FixedAccountLSP does not implement withdraw method
         System.out.println("Fixed Account LSP Balance: " + fixedAccountLSP.getBalance());

    }
}
