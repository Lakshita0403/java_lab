import java.util.Scanner;

class palindrome {

    public static void main(String[] args)
    {

        int n, reverse = 0, remainder = 0;
        Scanner p = new Scanner(System.in);
        System.out.println("Enter a number: ");

        n = p.nextInt();

        int original = n;

        while(n != 0)
        {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }

        if(original == reverse)
        System.out.println(original +" is a palindrome number ");
        else
        System.out.println(original +" is not a palindrome number ");
    }

}