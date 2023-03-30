import java.util.Scanner;
class Program4{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hour :-");
        float f=sc.nextFloat();
        System.out.println("Enter the Minute :-");
        float i=sc.nextFloat();
        System.out.println("Enter the Sec :-");
        float j=sc.nextFloat();
        System.out.println("Enter Distance :-");
        double distance=sc.nextDouble();
        System.out.println(distance);
        double result=(f*3600)+(i*60)+(j);
         
         double result1=(distance*3600)/(result*1000);
         double result2=(distance)/(result);
         double result3=(distance*3600*1)/(result*1000*1.609);

         System.out.println("Speed in Km/hr "+ result1);
         System.out.println("Speed in m/s "+ result2);
         System.out.println("Speed in miles/hr "+ result3);

    }
}