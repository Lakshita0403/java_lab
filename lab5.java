import java.util.Scanner;

public class lab5 {

   public static void main(String[] args) {
        /*
         * Scanner p = new Scanner(System.in);
         * int a = p.nextInt();
         * int b = p.nextInt();
         * int c = a + b;
         * int d = a * b;
         * int e = a / b;
         * System.out.print(c + " ");
         * System.out.print(d + " ");
         * 
         * System.out.print(e + "");
         */

     /*   System.out.println("Enter size: ");
        Scanner p = new Scanner(System.in);
        int size = p.nextInt();

        int[] hey = new int[size];

        // input
        for (int i = 0; i < hey.length; i++) {
            hey[i] = p.nextInt();
        }
        
        System.out.println("Printing sorted array ! ");
        for (int i = 0; i < hey.length; i++) {
            for(int j = i + 1; j<hey.length; j++){
                int temp = 0;
                if(hey[i]>hey[j])
                {
                    temp = hey[i];
                    hey[i] = hey[j];
                    hey[j] = temp;
                }
            }
            System.out.println(hey[i]);
        } */


     /*   public static void  calculateFactorial(int t)
    { 
        if(t < 0)
        {
            System.out.println("invalid number!");
            return;
        }
        int prod = 1;
       for(int i = t; i>=1; i--)
       {
        prod = prod * i;
       }
       System.out.println("Factorial is : " +prod);
       return;
      // return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // int fact = calculateFactorial(a);
        // System.out.println("Factorial is : " +fact);
        calculateFactorial(a);
    } */

   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Factorial = fact(a);
        System.out.println("Factorial is : " +Factorial);
    }
    public static int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * fact(n -1);
        }  */


        // Fibonacci series 
        
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fibonacci series is : " +n1 +" " +n2);

        for(int i =2; i<a; i++)
        {
            int n3 = n1 + n2;
            System.out.print( +n3 +" ");
            n1 = n2;
            n2 = n3;

        }

    }
    }

          

       
        


      

    
