class calculator {
    int add(int a , int b){
        return a+b;
    }

    int add(int a , int b , int c){
        return a+b+c;
    }

    double add(double a , double b){
        return a+b;
    }
}

public class methodoverloading{
    public static void main(String[] args) {
        calculator c = new calculator();
       System.out.println(c.add(1, 2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(2.2, 2.3));
    }
}
