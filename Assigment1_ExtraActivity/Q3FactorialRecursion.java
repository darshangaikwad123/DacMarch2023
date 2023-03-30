import java.util.Scanner;
class Q3FactorialRecursion{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter The Number :- ");
int num1=sc.nextInt();
int result=Factorial(num1);

System.out.println("Factorial Of Number "+num1+" Is "+result);
}

static int Factorial(int n){
if(n==0||n==1)
{
return 1;
}
else
{
return n*Factorial(n-1);
}
}
}
