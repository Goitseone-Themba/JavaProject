package Lab4;

public class BankSimulation extends Loan{
    public static void main(String[] args) {
        //create two accounts
        createAccount("Themba", 500, 1001);
        createAccount("Gasemodimo", 1000, 1002);
        System.out.println("\n");

        //perform withdrawal and deposit
        withdraw(1001, 200);
        deposit(1002,50);
        System.out.println("\n");

        //perfom loan application and approval
        applyForLoan(1001, 600);
        approveLoan(1001, 600);
    }
}
