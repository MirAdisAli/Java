import java.util.*;
public class Classwork
{
   public static void main(String[] args) {
   Scanner sc= new Scanner(System.in); 
System.out.print("Enter a string: ");
String str= sc.nextLine();   
System.out.print("You have entered: "+str);   
       for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if ( (ch >= 'a' && ch <= 'z') ||
(ch >= 'A' && ch <= 'Z') ) {

ch = Character.toLowerCase(ch);;

if (ch == 'a' || ch == 'e' || ch == 'i' ||
ch == 'o' || ch == 'u')
System.out.println("char at index position "+ (i+1)+ " is " +ch +" is Vowel");
else
System.out.println("char at index position "+ (i+1)+ " is " +ch +" is Consonent");
}
else if (ch >= '0' && ch <= '9')
System.out.println("char at index position "+ (i+1) + " is " +ch +" is digit");
else
System.out.println("char at index position "+ (i+1)+ " is " +ch +" is Special char");
}
   }
}