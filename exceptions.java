/*
 Exceptions types: 

1. ArithmeticException
2. FileNotFoundException/ClassNotFoundException
3. ArrayIndexOutOfBoundException
4. StringIndexOutOfBoundException
5. InterruptedException  - threads --> when we distrub somehow a thread when its not working then this exception arises 
6. NumberFormatExaception --> at the time of typecasting
7. NullPointerException
8. NoSuchFieldException --> not having a variable
9. NoSuchMethodException --> not having a method 
10. IOException
11. classNotFoundException  */
// ********** printStackTrace is used in catch to transfer exceptions to log file to save there ************
 
// ********** java is platform independent because it  converts source code to bytes  **********



import java.io.*;

public class exceptions{
public static void main(String args[]) throws IOException
{
 
  /*
  int n = args.length;
   try{
   int a = 45/n;
   System.out.println(a);
}

catch(ArithmeticException ae)
{
//System.out.println(ae);
ae.printStackTrace();
}

finally
{

System.err.println("exe");

}
}
}

*/

InputStreamReader obj = new InputStreamReader(System.in);

BufferedReader br = new BufferedReader(obj);

char n = (char)br.read();
//  int n = br.read();

System.out.println(n);


}
} 