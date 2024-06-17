import java.util.*;

class Account{
    public static float balance=10000;

}

class Interface extends Account{
    public static void menu(){
        System.out.println("---------ATM---------");
        System.out.println("1 : Check Current Account Balance ");
        System.out.println("2 : Deposit Money ");
        System.out.println("3 : Withdraw Money ");
        System.out.println("4 : Exit ");
        System.out.println("\nEnter Your Choice: ");

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            depositMoney();
        }
        else if(choice==3){
            withdrawMoney();
        }
        else if(choice==4){
            System.out.println("Thank you for using the ATM ");
            return;
        }
        else{
            System.out.println("Enter a Valid Choice!");
            System.out.println();
            menu();
        }
    }

    public static void checkBalance(){
        System.out.println("Balance : "+balance);
        System.out.println();
        menu();
    }
    public static void depositMoney(){
        System.out.println("Enter Amount : ");
        Scanner sc=new Scanner(System.in);
        float deposit=sc.nextFloat();
        balance+=deposit;
        System.out.println("Amount Deposited");
        System.out.println("Updated Account Balance: "+balance);
        System.out.println();
        menu();
    }
    public static void withdrawMoney(){
        System.out.println("Enter Amount: ");
        Scanner sc=new Scanner(System.in);
        float withdraw=sc.nextFloat();
        if(balance>=withdraw){
            balance-=withdraw;
            System.out.println();
            System.out.println("...Amount Withdrawn...");
            System.out.println("Remaining Account Balance is : "+balance);
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("Insufficient Balance");
            System.out.println();
        }
        menu();

    }


}

public class ATMInterface {
    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.menu();

    }

}
