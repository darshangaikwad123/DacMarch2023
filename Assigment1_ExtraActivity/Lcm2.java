import java.util.Scanner;
class Lcm2{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int lcm=findlcm(num1,num2);
System.out.println(lcm);
}
static int findlcm(int num1,int num2)
{
int gcd= findgcd(num1,num2);
return (num1*num2)/gcd;
}
static int findgcd(int a,int b)
{
if(b==0)
{
return a;
}
else{
return findgcd(b,a%b);
 }
}

}