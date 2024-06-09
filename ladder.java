import java.util.Scanner;

class ladder
{
public static void main(String[] args)
{
  /*  int n;
    Scanner h = new Scanner(System.in);
    System.out.println("Enter a number: ");

    n = h.nextInt();

    for(int i = 0; i<=n; i++)
    {
        System.out.println("*   *");
        System.out.println("*   *");

    

    if(i<n)
    {
        System.out.println("*****");
    }
    }
    */

    int i, j;
    for(i=0; i<5; i++)
    {
        for(j=0; j<5; j++)
    {
        if(i>=j && j<i+2)
        {
            int a = j+1;
            System.out.println(a +" ");
        }
    }
    System.out.println();
    }
}
}