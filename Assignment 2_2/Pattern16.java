class Pattern16{
public static void main(String [] args)
{
for(int i=1;i<=5;i++)
{
	System.out.println(" ");

for(int j=1;j<=5;j++)
{
if(j==5 || 6-j==i || i==5 )
{

System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println(" ");
}
}
}
