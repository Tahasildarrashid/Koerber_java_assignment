import java.sql.SQLOutput;
import java.util.Scanner;

class Account
{
    protected String name;
    protected int accountNumber;
    protected int accountBalance;

    Account(){}

    Account(String name, int accountNumber, int accountBalance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void deposit(int amount){
        this.accountBalance += amount;
        System.out.println("Balance is " + this.accountBalance);
    }
}

class SavingsAccount extends Account
{
    private static int interest = 5;

    SavingsAccount(String name, int accountNumber, int accountBalance)
    {
        super(name , accountNumber, accountBalance);
    }

    public float getBalance()
    {
        // Applying interest to the balance.
        float a = (float) interest / 100;
        float increment = a * this.accountBalance;
        float total = this.accountBalance + increment;
        return total;
    }

    public void withdraw_amount(int amt)
    {
        if(amt <= this.accountBalance)  // Check if sufficient balance
        {
            this.accountBalance -= amt;  // Deduct the amount from balance
            System.out.println("Remaining Balance is: " + this.accountBalance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

class CurrentAccount extends Account
{
    protected int tradeLicenseNumber;
    protected int overdraft;

    public CurrentAccount(String name, int accountNumber, int accountBalance)
    {
        super(name, accountNumber, accountBalance);
    }

    public CurrentAccount(int tradeLicenseNumber, int overdraft)
    {
        this.tradeLicenseNumber = tradeLicenseNumber;
        this.overdraft = overdraft;
    }

    public float getBalance()
    {
        return this.accountBalance;
    }

    public void withdraw(int amt)
    {
        if(amt <= accountBalance)
        {
            accountBalance -= amt;
            System.out.println("Remaining Balance is: "+ accountBalance + overdraft);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}
public class day3 {
    public static void main(String[] args)
    {
        Account a = new Account("rashid", 123456, 12350);
        a.deposit(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which account do u want to open ? Please Enter your choice");
        System.out.println("Savings account");
        System.out.println("Current account");
        String user_choice = scanner.nextLine();

        switch(user_choice.toLowerCase())
        {
            case "savings account":
                String name1 = scanner.nextLine();
                int accnumber1 = scanner.nextInt();
                int accbalance1 = scanner.nextInt();
                SavingsAccount s = new SavingsAccount(name1, accnumber1, accbalance1);
                s.getBalance();
                s.withdraw_amount(1200);
                break;

            case "current account":
                String name2 = scanner.nextLine();
                int accnumber2 = scanner.nextInt();
                int accbalance2 = scanner.nextInt();
                CurrentAccount c = new CurrentAccount(name2, accnumber2, accbalance2);
                c.getBalance();
                c.withdraw(15000);
                break;
        }
    }
}
