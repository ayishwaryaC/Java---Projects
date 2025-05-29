import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("    WELCOME TO ONLINE FOOD ORDER (:    " + name);
        System.out.println();
        System.out.println("HERE IS YOUR MENU CARD, " + name);
        System.out.println("Choose your option below");
        System.out.println("1. VEG ITEMS");
        System.out.println("2. NON-VEG ITEMS");
        int attempts = 0;
        int choice = sc.nextInt();
        int vegprice = 0;
        int nonvegprice = 0;
        int total = 0;
        int coupon = 1010;
        if (choice == 1) {
            System.out.println("The veg items available now:");
            System.out.println("1. Masala Dosa");
            System.out.println("2. Plain Dosa");
            System.out.println("3. Idly");
            System.out.println("4. Veg Meals");
            vegprice = sc.nextInt();
        } else if (choice == 2) {
            System.out.println("The non-veg items available now:");
            System.out.println("5. Biriyani");
            System.out.println("6. Chicken Rice");
            System.out.println("7. Chicken Noodles");
            System.out.println("8. Non-Veg Meals");
            nonvegprice = sc.nextInt();
        } else {
            System.out.println("YOU ENTERED THE WRONG OPTION ): PLEASE CHOOSE THE CORRECT OPTION");
        }

        // Handle veg selection
        if (vegprice == 1) {
            System.out.println("One plate Masala Dosa price: 100");
        } else if (vegprice == 2) {
            System.out.println("One plate Plain Dosa price: 50");
        } else if (vegprice == 3) {
            System.out.println("One plate Idly price: 50");
        } else if (vegprice == 4) {
            System.out.println("One plate Veg Meals price: 150");
        } else{
            System.out.println("");
        }

        // Handle non-veg selection
        if (nonvegprice == 5) {
            System.out.println("One plate Biriyani price: 100");
        } else if (nonvegprice == 6) {
            System.out.println("One plate Chicken Rice price: 150");
        } else if (nonvegprice == 7) {
            System.out.println("One plate Chicken Noodles price: 250");
        } else if (nonvegprice == 8) {
            System.out.println("One plate Non-Veg Meals price: 250");
        } else{
            System.out.println(" ");
        }
     
     
     
        while (attempts <= 3) {
            attempts = sc.nextInt();
            int item = sc.nextInt();

            if (item == 0) {
                break;
            }

            if (item == 1) {
                total += 100;
                System.out.println("Masala Dosa added. Total = " + total);
            } else if (item == 2) {
                total += 50;
                System.out.println("Plain Dosa added. Total = " + total);
            } else if (item == 3) {
                total += 50;
                System.out.println("Idly added. Total = " + total);
            } else if (item == 4) {
                total += 150;
                System.out.println("Veg Meals added. Total = " + total);
            } else if (item == 5) {
                total += 100;
                System.out.println("Biriyani added. Total = " + total);
            } else if (item == 6) {
                total += 150;
                System.out.println("Chicken Rice added. Total = " + total);
            } else if (item == 7) {
                total += 250;
                System.out.println("Chicken Noodles added. Total = " + total);
            } else if (item == 8) {
                total += 250;
                System.out.println("Non-Veg Meals added. Total = " + total);
        } else {
                attempts++;
                if(attempts < 3){
                    System.out.println("YOU ENTERED THE WRONG PIN - PLEASE TRY AGAIN! Attempts left: " + (3 - attempts));
                } else {
                    System.out.println("YOUR ATTEMPTS ARE OVER - YOUR ACCOUNT IS BLOCKED!");
                }
        }
        
         System.out.println("DO YOU HAVE ANY COUPONS AVAILABLE-TYPE-Y/N");
          String response = sc.next();

        if (response.equalsIgnoreCase("Y")) {
            System.out.println("Please enter your coupon code:");
            
         int usercoupon = sc.nextInt();
         
         if(coupon == usercoupon){
             System.out.println("***Sparkling*** -- YOU GOT AS DISCOUNT");
             double discount = total * 0.20;
                total -= discount;
                System.out.println("Coupon applied! You saved ₹" + (int)discount);
            } else {
                System.out.println("Invalid coupon code. No discount applied.");
            }
        }
        
        
        System.out.println("Thank you, " + name + "! Your final total is " + total);
        System.out.println("Your order will be delivered soon!");   
        } 
}
}

