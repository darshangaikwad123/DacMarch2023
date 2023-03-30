import java.util.Scanner;
class Q6LeapYear{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter The Year :- ");
int num1=sc.nextInt();
if(((num1%4==0)&&(num1%100 !=0))||(num1%400==0))
System.out.println("Year "+num1+" Is Leap ");
else
System.out.println("Year "+num1+"Is Not Leap");
}
}