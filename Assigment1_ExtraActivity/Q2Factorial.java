import java.util.Scanner;
class Q2Factorial{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter The Number :- ");
int num1=sc.nextInt();
int result=1;
for(int i=1;i<=num1;i++)
{
result=(i*result);
}
System.out.println("Factorial Of Number "+num1+" Is "+result);
}
}