class Student{
    private String name;
    private int age;
    private String course;


   public void setname(String name){
    this.name = name;
   }

   public void setage(int age){
   
        this.age = age;
    
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



public void displaydetails(){
   System.out.println("----------------------");
   System.out.println("   STUDENT DETAILS    ");
   System.out.println("----------------------");
   System.out.println("Name   :" + getname());
   System.out.println("Age    :" + getage());
   System.out.println("Course :" + getcourse());
}

}



public class encapsulation4 {
    public static void main(String[] args) {
        Student e;
        e = new Student();
        e.setname("Ayishu");
        e.setage(22);
        e.setcourse("java");
        e.displaydetails();
    }
}
