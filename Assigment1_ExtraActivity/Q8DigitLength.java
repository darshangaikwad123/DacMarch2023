import java.util.Scanner;
class Q8DigitLength{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number :-");
int i=sc.nextInt();
String s=String.valueOf(i);
System.out.println("The Length Of Digit In Number is "+ s.length());
}
}