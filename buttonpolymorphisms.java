class button {
    void show(){
        System.out.println("button pressed");
    }
}

class tv extends button{
    void show(){
        System.out.println("Tv on");
    }
}

class Ac extends button{
    void show(){
        System.out.println("AC on");
    }
}

class fan extends button{
    void show(){
        System.out.println("fan start");
    }
}

public class buttonperform{
public static void main(String[] args){
      button b ;
      b = new tv();
      b.show(); 

      b = new Ac();
      b.show();

      b = new fan();
      b.show();
}
}
