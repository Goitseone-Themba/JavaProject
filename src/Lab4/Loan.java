package Lab4;

public class Loan extends Bank{

    public static void applyForLoan(int accountNumber, double loanAmount)   {
        for(userAccount account : accountArr)   {
            if ((account.getAccountNumber()) == accountNumber)  {
                System.out.println("Loan application received, please wait for approval.");
            }
        }
    }
    public static void  approveLoan(int accountNumber, double loanAmount) {

        for(userAccount account : accountArr)   {
            if ((account.getAccountNumber()) == accountNumber)  {
                if (loanAmount <= (account.getBalance()*2))  {
                    account.setBalance(account.getBalance() + loanAmount);
                    account.setOwedAmount(loanAmount);
                    System.out.println("Loan approved, New balance is P" + account.getBalance());
                }   else {
                    System.out.println("Sorry, you do not qualify for that loan amount.");
                }
            }
        }

    }


}
