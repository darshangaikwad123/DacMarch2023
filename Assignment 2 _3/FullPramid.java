class FullPramid{
public static void main(String [] args)
{
boolean k;

for(int i=0; i<=6;i++)
{
k=true;
for(int j=0;j<=10;j++)
{
if(((j>=6-i) && (j<=4+i)) && k)
{
System.out.print("*");
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
