class Pattern4{
public static void main(String [] args)
{
	int l,k;
for(int i=1;i<=9;i++)
{
l=1;
k=i;
for(int j=1;j<=17;j++)
{
if(j>=i && j<=5)
{
System.out.print(l);
l++;
}
if(j<=6-i)
{
System.out.print(k);	
k--;
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