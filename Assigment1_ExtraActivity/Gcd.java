import java.util.Scanner;
class Gcd{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int result=findgcd(num1, num2);
System.out.println(result);
}
 static int findgcd(int num1,int num2)
{
while(num2 !=0)
{
int temp=num2;
num2=num1%num2;
num1=temp;
}
return num1;
}
}