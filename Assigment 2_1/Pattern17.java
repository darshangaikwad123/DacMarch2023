class Pattern17{
public static void main(String [] args)
{
int sum=1;
for(int i=0;i<=5;i++)
{
for(int j=0;j<=5;j++)
{
if(j<=i)
{
System.out.print(sum +" ");
sum++;
}
else
{
System.out.print(" ");
}
}
System.out.println(" ");
}
}
}