import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-----------------STUDENTS RESULT MANAGEMENT SYSTEM----------------");
    System.out.println("------------------------------------------------------------------");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("------------------------------------------------------------------");
    System.out.println("                    GET THE MARKS FROM STUDENTS");
    System.out.println("------------------------------------------------------------------");
     System.out.println("                                                           MARKS");
    System.out.print("Enter the mark of cn   :                                      ");
    int cn = sc.nextInt();
    System.out.print("Enter the mark of oose :                                      ");
    int oose = sc.nextInt();
    System.out.print("Enter the mark of oops :                                      ");
    int oops = sc.nextInt();
    System.out.print("Enter the mark of fswd :                                      ");
    int fswd = sc.nextInt();
    System.out.print("Enter the mark of we   :                                      ");
    int we = sc.nextInt();
    System.out.println("------------------------------------------------------------------");
    int total = cn + oose + oops + fswd + we;
    System.out.println("TOTAL                  :                                      "+total);
    System.out.println("------------------------------------------------------------------");
    int average = total / 5;
    System.out.println("AVERAGE                :                                      "+average);
    
    System.out.println(" ");
    System.out.println(" ");
    
    
    
    
    System.out.println("---------------STUDENT GRADE---------------");
    
    if(average>=90){
         System.out.println("A+");
    }else if(average>=80){
         System.out.println("A");
    }else if(average>=70){
         System.out.println("B+");
    }else if(average>60){
          System.out.println("B");
    }else if(average>50){
         System.out.println("C");
    }else {
         System.out.println("F");
    } 
    
    if(average > 50){
        System.out.println("YOUR ARE PASSED (:");
    }else{
        System.out.println("YOUR ARE FAIL ):"); 
    }
    }
}
