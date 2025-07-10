class encapsul {
   private String name;
   private int age;


   public void setname(String name){
    this.name = name;
   }

   public void setage(int age){
        this.age = age;
   
   }

   public String getname(){
    return name;
   }

   public int getage(){
    return age;
   }




}
public class encapsulation1 {
    public static void main(String[] args) {
        encapsul u;
        u = new encapsul();
        u.setage(17);
        u.setname("Ayishu");
        System.out.println(u.getname());
        System.out.println(u.getage());




        //epo nan ethu kudutha complie agum run um agum, but output show agathu , bcoz java only exceute the method . Output show aga sysout use pannaum
        // u.getage();
        // u.getname();
    }
}
