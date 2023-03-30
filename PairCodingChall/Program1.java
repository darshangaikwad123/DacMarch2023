import java.util.Scanner;
class Program1{
   public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :-");
    int num=sc.nextInt();
    int add=0;
    int sum,rem;
    if(num>=1 && num<=1000)
    {
        while(num>0)
        {
            sum=num%10;
            add+=sum;
            rem=num/10;
            num=rem;

        }   
    }
    else{
        System.out.println("Enter the valid number");
    }
     System.out.println("Sum is "+add);

    }
}