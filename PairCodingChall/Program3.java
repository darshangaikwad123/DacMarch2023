import java.util.Scanner;
class Program3{
   public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Minutes :-");
    int min=sc.nextInt();
    int year,day;
    day=min/(60*24);
    int day1=(day%365);
    year =day/365;
    System.out.println("Year is "+year +" days "+day1 );

   }
}