import java.util.Scanner;
class Program2{
   public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element of array");
    int ele=sc.nextInt();
    int arr []= new int[ele];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }

    int max=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(max<arr[i])
        {
          max=arr[i];
        }
    }
   System.out.println("Maximum Number is " + max);

   }
}