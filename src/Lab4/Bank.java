package Lab4;

import java.util.ArrayList;

public class Bank {
    static ArrayList<userAccount> accountArr = new ArrayList<>();

    public static void createAccount(String name, double initialBalance, int accountNumber)    {
        userAccount account = new userAccount(name,initialBalance, accountNumber);
        accountArr.add(account);
        System.out.println(account.getName() + " Account created successfully");
    }

    public static String withdraw(int accountNumber, double amount)  {

        //traverse the list of accounts, retrieve the specific account
        for(userAccount account : accountArr)   {
            if ((account.getAccountNumber()) == accountNumber)  {
                if(amount <= account.getBalance())   {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("P" + amount + " withdrawal successful. New balance is P" + account.getBalance());
                }else   {
                    System.out.println(account.getName() + " the amount exceeds your balance.");
                }
            }
        }
        return null;
    }

    public static void deposit(int accountNumber, double amount)    {

        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        //traverse the list of accounts, retrieve the specific account
        for(userAccount account : accountArr)   {
            if ((account.getAccountNumber()) == accountNumber)  {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Deposit successful, New balance is " + account.getBalance());
                return;
            }
        }
    }
}
