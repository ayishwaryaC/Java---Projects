import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("    --------------SMART ASSISTANT--------------    ");
        String st = sc.nextLine();
        System.out.println("");
        if(st.equals("Time")){
            System.out.println("");
            System.out.println("Now the time was 19:35");
        }else if(st.equals("Weather")){
            System.out.println("");
            System.out.println("Today the cloud as shown as dark , may at 20:20 could ba a rain");
        }else if(st.equals("News")){
            System.out.println("");
            System.out.println("The TNPSC Exam date are announed  day by day");
        }else if(st.equals("Joke")){
            System.out.println("");
            System.out.println("Why did the Java developer go broke? Because he used up all his cache!");
        }else{
            System.out.println("");
            System.out.println("Invaid commend! TRY Time, Weather , News , Joke");
        }
    }
}
