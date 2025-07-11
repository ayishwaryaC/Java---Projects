class Person{
    void speaks(String language){
        System.out.println("Person speaks : " + language);
    }
}

class Child extends Person{
    void speaks(String language){
        System.out.println("child speaks : " + language);
    }
}





public class methodoverriding {
    public static void main(String[] args) {
        Person p = new Person();
        p.speaks("english");
    }
    
}
