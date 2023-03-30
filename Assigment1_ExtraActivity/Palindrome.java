import java.util.*;

class Palindrome
{
    public static void palindrome(int n)
	{
	int r,sum=0;
	int orignal=n;
	    while(n>0)
		{
		    r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(orignal == sum)
		{
		    System.out.println("The Number is palindrome");
		}else
		{
		     System.out.println("The Number is not palindrome"); 
		}
	}
    public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int n = sc.nextInt();
		
		palindrome(n);
	}
}
