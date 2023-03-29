class Pattern18{
public static void main(String [] args)
{
	int alphabet=65;
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
if(j<=i)
{
System.out.print(" "+(char)(alphabet+j));
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