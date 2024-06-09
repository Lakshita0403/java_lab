// convert to fahrenhit to centigrade by taking input from the user

//import java.lang.*;
//import java.util.*;

import java.util.Scanner;

 class convert {

	public static void main(String[] args) {
/*
	//  double c, f;
 //  Scanner h = new Scanner(System.in);
 //System.out.println("Enter f value: ");
//f = h.nextDouble();
//c = 5.0/9*(f-32);
//c = ++f;
//System.out.println("c is : " +c);

*/

int a, b, c, l;

Scanner p = new Scanner(System.in);
System.out.println("Enter 3 value: ");
a = p.nextInt();
b = p.nextInt();
c = p.nextInt();

l = (a>b)?(a>c?a:c):((b>c)?b:c);
System.out.println("Result is: " +l);

}


}
