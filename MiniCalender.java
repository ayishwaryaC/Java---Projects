
import java.util.*;
public class minicalender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        int daysinmonth = 0;
        String monthname = " ";

        switch(month){
            case 1:
               monthname ="January";
               daysinmonth = 31;
               break;
            case 2:
               monthname ="Feb";
               if(year*400==0 ||(year%4==0&&year%100!=0)){
                  daysinmonth = 28;
               }else{
                 daysinmonth = 29;
               }
               break;
            case 3:
               monthname ="March";
               daysinmonth = 31;
               break;
            case 4:
               monthname ="April";
               daysinmonth = 30;
               break;
            case 5:
               monthname ="May";
               daysinmonth = 31;
               break;
            case 6:
               monthname ="June";
               daysinmonth = 30;
               break;
            case 7 :
               monthname ="July";
               daysinmonth = 31;
               break;
            case 8:
               monthname ="August";
               daysinmonth = 31;
               break;
            case 9:
               monthname ="September";
               daysinmonth = 31;
               break;
            case 10:
               monthname ="october";
               daysinmonth = 31;
               break;
            case 11:
               monthname ="November";
               daysinmonth = 31;
               break;
            case 12:
               monthname ="December";
               daysinmonth = 31;
               break;
           default:
              System.out.println("Please enter the valid month");
        }
        System.out.println("MonthName : " + monthname + " "+ "Numberofdays : "+ daysinmonth);
    }
}
