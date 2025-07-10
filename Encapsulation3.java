class Student{
    private String name;
    private int age;
    private String course;


   public void setname(String name){
    this.name = name;
   }

   public void setage(int age){
    if(age<18){
        System.out.println("please enter the age above 18");
    }else{
        System.out.println("the student age is " + age);
        this.age = age;
    }
   }


   public void setcourse(String course){
        this.course = course;
   }

   public String getname(){
    return name;
   }


   public int getage(){
    return age;
   }

   public String getcourse(){
    return course;
   }

}



public class encapsulation3 {
    public static void main(String[] args) {
        Student e;
        e = new Student();
        e.setage(23);
        e.setname("Aysihu");
        e.setcourse("java");
        System.out.println(e.getage());
        System.out.println(e.getcourse());
        System.out.println(e.getname());
    }
}
