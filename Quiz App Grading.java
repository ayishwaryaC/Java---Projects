import java.util.*;
public class QuizAppGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("               ----WELCOME TO QUIZ APP----               ");
        System.out.println("         [[[[ THIS QUIZ GAME IS BASED ON JAVA CODING ]]]]         ");
        System.out.println("         [[[[      TO START THE QUIZ ENTER - Y       ]]]]                      ");
        String choice = sc.nextLine();
        if(choice.equals("Y")){
            System.out.println("");
            System.out.println("");
            System.out.println("----YOUR QUIZ AS BEEN STARTED----");
        }else{
            System.out.println("----PLEASE ENTER Y - TO START THE QUIZ----");
        }
        
        System.out.println("");
        System.out.println("");
        int mark1 = 0;
        //question 1//
        System.out.println("1. What is the size of int in Java?");
        System.out.println("A. 2 bytes");
        System.out.println("B. 4 bytes");
        System.out.println("C. 8 bytes");
        System.out.println("D. Depends on OS");
        String ans1 = sc.nextLine();
        if(ans1.equals("B")){
            mark1 = 10;
        }else{
            mark1 = 0;
        }
        
        //question 2//
         System.out.println("");
        int mark2 = 0;
        System.out.println("2. Which of these is not a Java keyword?");
        System.out.println("A. static");
        System.out.println("B. boolean");
        System.out.println("C. void");
        System.out.println("D. if");
        String ans2 = sc.nextLine();
        if(ans2.equals("B")){
            mark2 = 10;
        }else{
            mark2 = 0;
        }
        
        
         //question 3//
        System.out.println("");
        int mark3 = 0;
        System.out.println("3. What is the output of this code?");
        System.out.println("int x = 5;");
        System.out.println("System.out.println(x++ + ++x);");
        System.out.println("A. 11");
        System.out.println("B. 13");
        System.out.println("C. 12");
        System.out.println("D. 10");
        String ans3 = sc.nextLine();
        if(ans3.equals("C")){
            mark3 = 10;
        }else{
            mark3 = 0;
        }
        
         //question 4//
          System.out.println("");
        int mark4 = 0;
        System.out.println("4.Which of the following is used to create an object in Java?");
        System.out.println("A. create()");
        System.out.println("B. class");
        System.out.println("C. new");
        System.out.println("D. object()");
        String ans4 = sc.nextLine();
        if(ans4.equals("C")){
            mark4 = 10;
        }else{
            mark4 = 0;
        }
        
         //question 5//
          System.out.println("");
        int mark5 = 0;
        System.out.println("5.Which method is the entry point of a Java program?");
        System.out.println("A. main()");
        System.out.println("B. start()");
        System.out.println("C. run()");
        System.out.println("D. init()");
        String ans5 = sc.nextLine();
        if(ans5.equals("A")){
            mark5 = 10;
        }else{
            mark5 = 0;
        }
        
        
         //question 6//
          System.out.println("");
        int mark6 = 0;
        System.out.println("6.What is the output of this code?");
        System.out.println("System.out.println(10 + 20 + \"java\");");
        System.out.println("A. Java1020");
        System.out.println("B. Java30");
        System.out.println("C. 30Java ");
        System.out.println("D. 1020Java");
        String ans6 = sc.nextLine();
        if(ans6.equals("C")){
            mark6 = 10;
        }else{
            mark6 = 0;
        }
        
        
         //question 7//
          System.out.println("");
        int mark7 = 0;
        System.out.println("7. Which of these is the correct syntax to declare an array in Java?");
        System.out.println("A. int arr[] = new int[5];");
        System.out.println("B. int arr = new int[5];");
        System.out.println("C. arr = int[5];");
        System.out.println("D. array int arr[5];");
        String ans7 = sc.nextLine();
        if(ans7.equals("A")){
            mark7 = 10;
        }else{
            mark7 = 0;
        }
        
        
         //question 8//
         System.out.println("");
        int mark8 = 0;
        System.out.println("8. What does the final keyword mean in Java?");
        System.out.println("A. The variable cannot be changed");
        System.out.println("B. The class cannot be inherited");
        System.out.println("C. The method cannot be overridden");
        System.out.println("D. All of the above");
        String ans8 = sc.nextLine();
        if(ans8.equals("D")){
            mark8 = 10;
        }else{
            mark8 = 0;
        }
        
        
         //question 9//
        System.out.println("");
        int mark9 = 0;
        System.out.println("9. Which exception is thrown when you divide by zero in Java (for integers)?");
        System.out.println("A. ArithmeticException");
        System.out.println("B. NullPointerException");
        System.out.println("C. NumberFormatException");
        System.out.println("D. ArrayIndexOutOfBoundsException");
        String ans9 = sc.nextLine();
        if(ans9.equals("A")){
            mark9 = 10;
        }else{
            mark9 = 0;
        }
        
         //question 10//
        System.out.println("");
        int mark10 = 0;
        System.out.println("10. Which of the following is used to take input from the user in Java?");
        System.out.println("A. ConsoleReader");
        System.out.println("B. InputScanner");
        System.out.println("C. Scanner");
        System.out.println("D. JavaInput");
        String ans10 = sc.nextLine();
        if(ans10.equals("C")){
            mark10 = 10;
        }else{
            mark10 = 0;
        }
        System.out.println("");
        System.out.println("");
        int total = mark1 + mark2 + mark3 + mark4 + mark5 + mark6 + mark7 + mark8 + mark9 + mark10;
        System.out.println("          -----------------------          ");
        System.out.println("          Your total mark is " + total      );
        if(total > 90){
            System.out.println("          YOU GOT A - A+ GRADE ");
        }else if(total > 80){
            System.out.println("          YOU GOT A - A GRADE ");
        }else if(total > 70){
            System.out.println("          YOU GOT A - B+ GRADE ");
        }else if(total > 60){
            System.out.println("          YOU GOT A - B GRADE ");
        }else if(total > 50){
            System.out.println("          YOU GOT A - C GRADE ");
        }else {
            System.out.println("          YOU GOT A - F GRADE ");
        }
    }
}
