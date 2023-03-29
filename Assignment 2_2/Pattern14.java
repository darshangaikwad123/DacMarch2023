class Pattern14{
public static void main(String [] args)
{
boolean k=false;
boolean l=false;
for(int i=1;i<=5;i++)
{ 
k=true;
for(int j=1;j<=9;j++)
{
if(j>=i && j<=10-i && k)
{
System.out.print("*");
k=false;
}
else
{
System.out.print(" ");
k=true;
}
}
System.out.println(" ");
}
for(int i=2;i<=5;i++)
{ 
l=true;
for(int j=1;j<=9;j++)
{
if(j>=6-i && j<=4+i && l)
{
System.out.print("*");
l=false;
}
else
{
System.out.print(" ");
l=true;
}
}
System.out.println(" ");
}
}
}