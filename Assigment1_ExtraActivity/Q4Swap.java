import java.util.Scanner;
class Q4Swap{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter The Number 1 :- ");
int num1=sc.nextInt();
System.out.println("Pleasre Enter The Number 2 :- ");
int num2=sc.nextInt();
System.out.println("Enter The Number 1 Before Swap :- "+ num1 +"\nEnter The Number 2 Before Swap :- "+num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("Enter The Number 1 After Swap :- "+ num1 +"\nEnter The Number 2 After Swap :- "+num2);
}
}