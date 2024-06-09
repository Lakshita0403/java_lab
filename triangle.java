import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		int a, b, c;
		double s, area;
		Scanner krishna = new Scanner (System.in);
		System.out.println("Enter three sides of triangle ");
		a = krishna.nextInt();
		b = krishna.nextInt();
		c = krishna.nextInt();
		
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Triangle's area is: "+area);
	}
}	