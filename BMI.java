import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double height2 = height * height;
        double bmi = weight / height2;
        System.out.println("Your BMI is:" + bmi);
        if(bmi < 18.5){
            System.out.println("UnderWeight");
        }else if(bmi < 24.9){
            System.out.println("normal");
        }else if(bmi < 29.9){
            System.out.println("Overweight");
        }else if(bmi >= 30.0){
            System.out.println("obese");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
