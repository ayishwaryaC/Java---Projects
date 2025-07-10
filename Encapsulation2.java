class Student{
    private String name;
    private int age;

    
    public void setname(String name){
        this.name = name;
    }


    public void setage(int age){
        if(age<18){
            System.out.println("plaese enter the age above 18");
        }else{
            System.out.println("The student age is "+ age);
            this.age = age;
        }
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }


}

public class encapsulation2{
    public static void main(String[] args) {
            Student e;
            e = new Student();
            e.setage(12);
            e.setname("udhaya");
            System.out.println(e.getage());
            System.out.println(e.getname());
        }
}
