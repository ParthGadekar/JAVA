import java.util.Scanner;

public class Bank {
    public static double balance,rate,Accno;
    public static String name,address,mobileno;
    public static Scanner s = new Scanner(System.in);

    //method to create an account
    static void createAccount(){
        System.out.println("Enter your Account Number:");
        Bank.Accno = s.nextDouble();
        System.out.println("Enter your Full Name: ");
        Bank.name = s.next();
        System.out.println("Enter your Address.....");
        Bank.address = s.next();
        System.out.println("Enter your valid mobile no.....");
        Bank.mobileno = s.next();
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    //method to deposit money
    static void deposit(){
        System.out.println("Account Balance: "+Bank.balance);
        System.out.println("Enter the amount to be deposited: ");
        double depositeAmt = s.nextDouble();
        Bank.balance += depositeAmt;
        System.out.println("Amount Deposited.....");
        System.out.println("Balance amount after Deposit: "+Bank.balance);
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    //method to withdraw money
    static void withdraw(){
        System.out.println("Account Balance: "+Bank.balance);
        System.out.println("Enter the amount to withdraw: ");
        double withdrawAmt = s.nextDouble();
        Bank.balance -= withdrawAmt;
        System.out.println("Amount Withdrawn.....");
        System.out.println("Balance amount after Withdrawal "+Bank.balance);
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    //method to compute interest
    static void computeInterest(){
        if (Bank.balance < 200000)
            Bank.rate = 3.5;
        else
            Bank.rate = 4.5;
        System.out.println("Interest Rate for you is: " + Bank.rate + "%");
        int flag = 0;
        do {
            System.out.print("Enter the Time in Years : ");
            int time = s.nextInt();
            double CI = (Bank.balance * (Math.pow((1 + Bank.rate / 100), time)))-Bank.balance;
            System.out.println("The Compound Interest is : " + CI);
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("To save changes and add the interest to balance, Enter Y, To Re-Enter no of years press any other key: ");
            char opt = s.next().charAt(0);
            if (opt == 'Y' || opt == 'y') {
                Bank.balance += CI;
                System.out.println("Total Amount after addition of interest: " + Bank.balance);
                System.out.println("--------------------------------------------------------------------------------------------------------");
                flag++;
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        } while (flag == 0);
    }
    //method to display account and the balance
    static void displayBalance(){
        System.out.println("Your Account number is: "+Bank.Accno);
        System.out.println("Your Name is:           "+Bank.name);
        System.out.println("Your Mobile no is:      "+Bank.mobileno);
        System.out.println("Your Address is:        "+Bank.address);
        System.out.println("Your Balance is:        "+Bank.balance);
        System.out.println("Your Interest rate is:  "+Bank.rate);
        System.out.println("Thank You For Using our Bank...");
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    public static void main(String[] args){
        int flag = 0;
        do {
            System.out.println("Welcome to the Bank online Portal.");
            System.out.println("1: Open Account");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Display Balance");
            System.out.println("5: Your Interest rate");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("Enter your choice:");
            int ch = s.nextInt();
            {
                switch (ch){
                    case 1:
                        Bank.createAccount();
                        break;
                    case 2:
                        Bank.deposit();
                        break;
                    case 3:
                        Bank.withdraw();
                        break;
                    case 4:
                        Bank.displayBalance();
                        break;
                    case 5:
                        Bank.computeInterest();
                        break;
                    default:
                        System.out.println("Invaid choice....PLEASE OPT THE RIGHT CHOICE.....THANKYOU");
                        break;
                }
            }
            System.out.println("Do you want to Exit? (type Y) Else type any character key and press Enter to continue....");
            char opt = s.next().charAt(0);
            if (opt == 'Y' || opt == 'y') {
                flag++;
                System.out.println("Thank You for using our service...");
            }
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
        while (flag == 0);
    }
}
