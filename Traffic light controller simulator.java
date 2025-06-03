import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-------------TRAFFIC LIGHT CONTROLLER SIMULATOR------------");
    System.out.println("                      ");
    System.out.println("                      ");
    System.out.println("               -------------------------           ");
    System.out.println("               -------------------------           ");
    System.out.println("               ----------RED------------           ");
    System.out.println("               --------YELLOW-----------           ");
    System.out.println("               ---------GREEN-----------           ");
    System.out.println("               -------------------------           ");
    System.out.println("               -------------------------           ");
    System.out.println("                      ");
    String signal = sc.next();
    
    if(signal.equalsIgnoreCase("red")){
        System.out.println("STOP");
    }else if(signal.equalsIgnoreCase("yellow")){
        System.out.println("SLOW DOWN");
    }else if(signal.equalsIgnoreCase("green")){
        System.out.println("GO");
    }else if(signal.equalsIgnoreCase("emergency")){
        System.out.println("STOP IMMEDIALTELY CLEAR THE WAY FOR EMERGENCY VECHICALS");
    }else{
        System.out.println("Enter signal was wrong");
    }
    
    }
}
