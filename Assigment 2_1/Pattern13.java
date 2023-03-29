class Pattern13{
public static void main(String [] args)
{
boolean k;
int l;
for(int i=0; i<=5;i++)
{
l=64+i;
k=true;
for(int j=0;j<=9;j++)
{	
if(((j>=6-i) && (j<=4+i)) && k)
{	
System.out.print((char)(l));
k=false;
}
else
{
k=true;
System.out.print(" ");
}
}
System.out.println(" ");
}
}
}