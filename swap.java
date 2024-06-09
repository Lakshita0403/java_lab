import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, temp;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter a and b: ");
		a = t.nextInt();
		b = t.nextInt();
		System.out.println("Before swap a and b : " +a+" "+b);
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap a and b : " +a+" "+b);
}

}
