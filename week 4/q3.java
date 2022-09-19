import java.util.Scanner;
class Bank
{
    String name, acc_type;
    long acc_no;
    double balance;
    static double rate=6.5;
    Scanner sc=new Scanner(System.in);
    Bank()
    {
        name="Disha";
        acc_type="Savings";
        acc_no=123456789;
        balance=9000;
    }

    Bank(String n, String at, long an, double b)
    {
        name=n;
        acc_type=at;
        acc_no=an;
        balance=b;
    }

    void deposit()
    {
        System.out.println("Enter amount");
        double amt=sc.nextDouble();
        balance+=amt;
        System.out.println("Deposit successful");
    }

    void withdraw()
    {
        System.out.println("Enter amount");
        double amt=sc.nextDouble();
        if (balance<amt)
        {
            System.out.println("Not enough Balance. Fine: Rs 100");
            balance-=100;
        }
        else
        {
            balance-=amt;
            System.out.println("Withdraw successful");
        }
    }

    void display()
    {
        System.out.println("\nThe Details are: \nName: "+name+"\nAccount number: "+acc_no+"\nAccount type: "+acc_type+"\nAccount balance: "+balance);
    }

    static void display_r()
    {
        System.out.println("The rate of interest is "+rate+"%");
    }
}

class q3
{
    public static void main(String args[]) 
    {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details: \nName, Account number, Account type, Account balance: ");
        String n=sc.nextLine();
        long an=sc.nextLong();
        sc.nextLine();
        String at=sc.next();
        double b=sc.nextDouble();
        Bank B= new Bank(n, at, an, b);
        while(c!=5)
        {
            System.out.println("\n\nEnter \n1 to display the details \n2 to withdraw money \n3 to deposit money \n4 to display rate \n5 to exit");
            c=sc.nextInt();
            if(c==1) B.display();
            else if(c==2) B.withdraw();
            else if(c==3) B.deposit();
            else if(c==4) Bank.display_r();
            else if(c==5) System.out.println("Exitting!");
            else System.out.println("Invalid Input");
        }
        
    }
}
