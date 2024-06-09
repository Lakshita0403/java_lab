import java.util.Scanner;

class student
{
String name;
String city;
int age;

public void printdata()
{
System.out.println("Name: "+name);
System.out.println("City: "+city);
System.out.println("Age: "+age);
}
}

public class p1{
public static void main(String[] args)
{
student s1 = new student();
student s2 = new student();
s1.name = "radhe";
s1.city = "barsana";
s1.age = 23;

s2.name = "krishna";
s2.city = "mathura";
s2.age = 25;

s1.printdata();
s2.printdata();
}
}




