import java.util.Scanner;
class Q5PositiveNegative{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter The Number :- ");
int num1=sc.nextInt();
if(num1<0)
System.out.println("Number "+num1+" Is Negative ");
else
System.out.println("Number "+num1+" Is Positive ");
}
}