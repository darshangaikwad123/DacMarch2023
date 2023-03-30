import java.util.Scanner;
class Q9FactorOfNumber{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number ");
int num=sc.nextInt();
System.out.println("Follwing Are Factors of Number "+num+" Are");
for(int i=1;i<=num;i++)
{
 if(num%i==0)
 System.out.println(i);
}
}
}