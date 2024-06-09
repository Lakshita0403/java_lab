import java.util.Scanner;

class student2 {
    String name;
    String city;
    int age;

    public void getdata(String name, String city, int age )
    {
      this.name = name;
      this.city = city;
      this.age = age;
}

public void printdata()
{
        System.out.println("name : " +name);
        System.out.println("city : " +city);
        System.out.println("age : " +age);

    }

}
    public class p2 {
        
        public static void main(String[] args)
         {
            student2 s1 = new student2();
            s1.getdata("siya","mithila",26);
            s1.printdata();
            
            student2 s2 = new student2();
            s2.getdata("ram","ayodhya",24);
            s2.printdata();
            
        }
    }














