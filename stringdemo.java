import java.util.Scanner;

class stringdemo
{
public static void main(String[] args)
{
/*String name = "Radhe";
System.out.println(name);
name+="Krishna";
System.out.println(name); */

/* String name = "shri";
String Name = new String("Radhe");
System.out.println(name + Name); */

String name = "Radhe Radhe Hare Krishna";
System.out.println("Length of String is :" +name.length());

System.out.println("In Uppercase : " + name.toUpperCase());

System.out.println("In Lowercase : " + name.toLowerCase());

System.out.println("5th character is:" + name.charAt(4));

System.out.println("Substring is :" + name.substring(9,16));

String str1 = "Krishna";
String str2 = "KRISHNA";


//if(str1.equals(str2))
if(str1 equalsIngnoreCase(str2)){

System.out.println("Both string are equal");
}

else
System.out.println("Both string are not equal");


}

}