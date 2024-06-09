import java.util.Scanner;

public class lab8_thread

// methods in thread class

// setname()
// get name()
// getPriority()
// setpriority()
// run()
// start()


{
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		System.out.println(t);
	}
}
