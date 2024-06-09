
class A extends Thread
{
    String name;
    A(String s)
    {
        name = s;
    }
public void run()
{
    for(int i = 1; i<5; i++)
    {
        System.out.println(name +" " +i);
    }
    // try
    // {

    //     Thread.sleep(1000);
    // }
    // catch(InterruptedException e)
    // {

    // }
}
}

public class lab9_isalive_join {
    public static void main(String ar[])
    {
    A obj1 = new A("Radha");
    A obj2 = new A("krishna");
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    System.out.println(t1.isAlive());
    System.out.println(t2.isAlive());
    t1.start();
    t2.start();
    System.out.println(t1.isAlive());
    System.out.println(t2.isAlive());
    
    try {
        t2.join();
        t1.join();
    } catch (InterruptedException e) {
        
    }
    System.out.println(t2.isAlive());
    System.out.println(t1.isAlive());
}
}