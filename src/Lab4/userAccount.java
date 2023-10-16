package Lab4;

public class userAccount {
    public String name = "";
    public int accountNumber = 0;
    public double balance = 0;
    public double owedAmount = 0;

    public userAccount(String name, double balance, int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.owedAmount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOwedAmount() {
        return owedAmount;
    }

    public void setOwedAmount(double owedAmount) {
        this.owedAmount = owedAmount;
    }
}
