import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("        -------------------E-COMMERCE CART----------------------       ");
        System.out.println("");
        System.out.println("        Choose your Category             ");
        System.out.println("        1.Electronis");
        System.out.println("        2.Clothes");
        System.out.println("        3.Groceries");
        int choice = sc.nextInt();
        System.out.println("");
        if(choice == 1){
            System.out.println("----Electronis Product avaiable----");
            System.out.println("1 AC");
            System.out.println("2 Washing Machine");
            System.out.println("3 Hair dyer");
            System.out.println("4 oven");
            
            int choice2 = sc.nextInt();
            if(choice2 == 1){
                System.out.println("---- AC avaiable----");
                System.out.println("1 Blue Star");
                System.out.println("2 Daikin");
                System.out.println("3 Voltas");
                System.out.println("4 LG");
                
                int choice2l1 = sc.nextInt();
                if(choice2l1 == 1){
                    System.out.println("Blue Star rate : 50000");
                }else if(choice2l1 == 2){
                    System.out.println("Daikin rate : 60000");
                }else if(choice2l1 == 3){
                    System.out.println("Voltas rate : 40000");
                }else if(choice2l1 == 4){
                    System.out.println("LG rate : 30000");
                }else {
                    System.out.println("YOU ENTERED THE WRONG OPTION ): PLEASE CHOOSE THE CORRECT OPTION");
                }
            }else if(choice2 == 2){
                System.out.println("----Washing machine avaiable----");
                System.out.println("1.Samsung");
                System.out.println("2.Whirlpool");
                System.out.println("3.IFB");
                System.out.println("4.Bosch");
                
                int choice2l2 = sc.nextInt();
                if(choice2l2 == 1){
                    System.out.println("Samsung rate : 50000");
                }else if(choice2l2 == 2){
                    System.out.println("Whirlpool rate : 60000");
                }else if(choice2l2 == 3){
                    System.out.println("IFB rate : 40000");
                }else if(choice2l2 == 4){
                    System.out.println("Bosch rate : 30000");
                }else {
                    System.out.println("YOU ENTERED THE WRONG OPTION ): PLEASE CHOOSE THE CORRECT OPTION");
                }
           }else if(choice2 == 3){
               System.out.println("----Hair dyer Product avaiable----");
               System.out.println("1.Philips");
               System.out.println("2.Dyson");
               System.out.println("3.Havells");
               System.out.println("4.Panasonic");
               int choice2l3 = sc.nextInt();
                if(choice2l3 == 1){
                    System.out.println("Philips rate : 50000");
                }else if(choice2l3 == 2){
                    System.out.println("Dyson rate : 60000");
                }else if(choice2l3 == 3){
                    System.out.println("Harvells rate : 40000");
                }else if(choice2l3 == 4){
                    System.out.println("Panasonic rate : 30000");
                }else {
                    System.out.println("YOU ENTERED THE WRONG OPTION ): PLEASE CHOOSE THE CORRECT OPTION");
                }
           }else if(choice2 == 4){
               System.out.println("----oven Product avaiable----");
               System.out.println("1.IFB");
               System.out.println("2.Samsung");
               System.out.println("3.LG");
               System.out.println("4.Bajaj");
               int choice4l1 = sc.nextInt();
                if(choice4l1 == 1){
                    System.out.println("IFB rate : 50000");
                }else if(choice4l1 == 2){
                    System.out.println("Samsung rate : 60000");
                }else if(choice4l1 == 3){
                    System.out.println("LG rate : 40000");
                }else if(choice4l1 == 4){
                    System.out.println("Bajaj rate : 30000");
                }else {
                    System.out.println("YOU ENTERED THE WRONG OPTION ): PLEASE CHOOSE THE CORRECT OPTION");
                }
           }else {
               System.out.println("YOU ENTERED THE WRONG OPTION ): PLEASE CHOOSE THE CORRECT OPTION");
            }
        }else if(choice == 2){
            System.out.println("----Clothes avaiable----");
            System.out.println("1.Ladies Dress");
            System.out.println("2.Gents Dress");
            int choice2l1 = sc.nextInt();
            if(choice2l1 == 1 ){
                System.out.println("1.Zara");
                System.out.println("1.H&M");
                
            }else if(choice2l1 == 2){
                System.out.println("1.Zara");
                System.out.println("1.H&M");
            }
            
        }else if(choice == 3){
            System.out.println("----Groceries Product avaiable----");
            System.out.println("1.Rice");
            System.out.println("2.wheat");
        }else {
            System.out.println("YOU ENTERED THE WRONG OPTION ): PLEASE CHOOSE THE CORRECT OPTION");
        }
    } 
}
