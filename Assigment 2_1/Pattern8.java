class Pattern8{
public static void main(String [] args)
{
boolean k;
int l;
for(int i=0; i<=5;i++)
{
l=6-i;
k=true;
for(int j=0;j<=9;j++)
{
if(((j>=6-i) && (j<=4+i)) && k)
{
System.out.print(l);
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