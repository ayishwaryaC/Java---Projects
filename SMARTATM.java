import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int crtpin = 7903;
        int balance = 150000;
        int withdraw = 0;
        int deposit = 0;
        int attempts = 0;
        System.out.println("                 WELCOME TO SMART ATM SIMULATOR             ");
        System.out.println(" ");
        System.out.println("How can I help you?");
        
        
        while(attempts < 3){
            System.out.println("Enter your pin :");
            int enterpin = sc.nextInt();
        System.out.println("Pin Entered:" + enterpin);
         if(crtpin==enterpin){
            System.out.println("                 YOU--ENTER--THE--PIN--AS--CRT (:              ");
        
         //else{
        //     System.out.println("    YOUR ATTEMPTS OVER- YOUR ACCOUNT BLOCK!    ");
        // }
        
        
        
        System.out.println(" ");
        System.out.println("Choose your option below :");
        System.out.println("1.Balance enquiry");
        System.out.println("2.Amount Withdraw");
        System.out.println("3.Amount deposit");
        int choice = sc.nextInt();
        
        if(choice == 1){
            System.out.println("Your current balance :" + balance);
        }else if(choice == 2){
            System.out.println("Please enter the amount to withdraw:");
            withdraw = sc.nextInt();
            // balance -= withdraw;
            if(withdraw <= balance){
                System.out.println("Your amount is ready get it!");
                balance -= withdraw;
            }else{
                System.out.println("Insuffient balnce in your account");
            }
        }else if(choice == 3){
            System.out.println("Please enter the amount to deposit:");
            deposit = sc.nextInt();
            balance += deposit;
            System.out.println("Now your account as balance:" + balance);
        }else{
            System.out.println("Invalid option selected");
        }
        System.out.println("    +------------------------+     ");
        System.out.println("    |Here your mini statement|     ");
        System.out.println("    |Balance:          " + balance + "|");
        System.out.println("    |Deposit:           " + deposit + "|");
        System.out.println("    |Withdraw:          " + withdraw + "|");
        System.out.println("    +------------------------+     ");
        break;
        }else {
                attempts++;
                if(attempts < 3){
                    System.out.println("YOU ENTERED THE WRONG PIN - PLEASE TRY AGAIN! Attempts left: " + (3 - attempts));
                } else {
                    System.out.println("YOUR ATTEMPTS ARE OVER - YOUR ACCOUNT IS BLOCKED!");
                }
            }
        }
    }
}
