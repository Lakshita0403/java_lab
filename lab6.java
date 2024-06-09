import java.util.Scanner;


/*abstract class A {

     abstract void call();

public void display()
{
 System.out.println("Call me from B");
}
}

class B extends A {

    void call() {
        System.out.println("Inherited method");
    }
}

public class lab6{

    public static void main(String[] args) {
        B obj = new B(); 
		 obj.call();
         obj.display(); 
    }
}*/




/*interface sum
{
 int sum(int a, int b);

}

interface add
{
    void add();
}

class B implements sum,add
{
  public int sum(int a, int b)
  {
    int c = a + b;
    return c; 
  }

  public void add()
  {

    int a = 5;
    int b = 3;
    int c = a+b;
    System.out.println(c);

  }
}

public class lab6{

    public static void main(String[] args) {
        B obj = new B(); 
	
        obj.add();
        int result = obj.sum(9,11);
        System.out.println(result);
    }
} */



/*abstract class vehicle
{
 abstract void engine();

}

class car extends vehicle
{
void engine(){
    System.out.println("car has good engine");

}
}

class truck extends vehicle
{
    void engine(){
        System.out.println("truck has bad engine");
    }
}

public class lab6{

    public static void main(String[] args) {
      car obj = new car();
      truck obj1 = new truck();

        obj.engine();
        obj1.engine();
      
        
    }
} */




