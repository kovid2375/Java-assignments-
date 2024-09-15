import java.util.Scanner;

class Account{
    public int account(int acc){
        System.out.println("your Account balance is : "+acc);
        return acc;
    }
}

public class AtmMachine {

    public static void main(String[] args) {
        System.out.println("Enter  your Account Details--->>>> ");
        Scanner sc1=new Scanner(System.in);

        System.out.println("Enter your Full Name::  ");
        String name=sc1.nextLine();
        System.out.println("Enter your Account number:: ");
        int number=sc1.nextInt();
        System.out.println("Enter your Account Balance :");
        int bal =sc1.nextInt();
        System.out.println("Enter your Bank name:");
        String bankname =sc1.next();

        Scanner sc=new Scanner(System.in);
        System.out.println("Press 0 : to start--->>");
        int a =sc.nextInt();
        System.out.println("Enter your PIN NUMBER ==  ");
        int f=sc.nextInt();

        for (int i = 0;i<=5; i++) {
        if (a==0) {
        String balance =" Press 1 :Check your Account Balance";
        String Cashwithdrawal="Press 2: Cash Withdrawal";
        String CashDeposite="Press 3: Cash Deposite";
        String PinChange="Press 4: Pin Change";
        String exitt="Press 5: Exit";
        System.out.println(balance);
        System.out.println(Cashwithdrawal);
        System.out.println(CashDeposite);
        System.out.println(PinChange);
        System.out.println(exitt);    
        }
        Scanner sc2=new Scanner(System.in);
        System.out.println("Press the above number to proceed--->>");
        int b=sc2.nextInt();
        System.out.println(" ");
        if (b==5) {
            System.out.println("++++++++ Thanks for visiting --------");
            break;
        }
        else if (b==1){
            Account obj=new Account();
            int res=obj.account(bal);            
        }
        else if(b==2){ 
            System.out.println(" ");
            System.out.println("Enter the Amount for CASH WITHDRUAL");
            Scanner sc3=new Scanner(System.in);
            int c=sc3.nextInt();
            int debited=bal-c;
            System.out.println("Your Cash has been debited--->>>>");
            System.out.println("your remaining cash is:: "+ debited);

        }
        else if(b==3){
            System.out.println(" ");
            System.out.println("Enter the Amount for CASH DEPOSITE");
            Scanner sc4=new Scanner(System.in);
            int d=sc4.nextInt();
            int deposite =bal+d;
            System.out.println("Your Cash has been Deposited----->>>>>");
            System.out.println("Your remaining Cash is ::"+deposite);
        }
        else if(b==4){
            System.out.println(" ");
            System.out.println("Enter the OTP for PIN Change--->>>>");
            int e=(int)(Math.random()*(1000-50000+1)+50000);
            System.out.println(e);
            Scanner sc5=new Scanner(System.in);
            System.out.println("Enter the otp recived:: ");
            int OTP=sc5.nextInt();
            if (OTP==e) {
                Scanner sc6=new Scanner(System.in);
                System.out.println("Enter your New PIN ::  ");
                int pin=sc6.nextInt();
                System.out.println("Your new PIN IS ----->>>> " + pin);
            }
            System.out.println("Your pin has sucessfully Changed");
        }   
    }
    }
}
