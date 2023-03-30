import java.util.Scanner;
class Q1EvenOdd{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter The Number :- ");
int num1=sc.nextInt();
if(num1%2==0)
System.out.println("Number "+num1+" Is Even ");
else
System.out.println("Number "+num1+" Is Odd ");
}
}