class Pattern9{
public static void main(String [] args)
{
boolean k;
int l=65;
for(int i=0; i<=5;i++)
{
l=65;
k=true;
for(int j=0;j<=9;j++)
{
if(((j>=6-i) && (j<=4+i)) && k)
{
System.out.print((char)(l));
l++;
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