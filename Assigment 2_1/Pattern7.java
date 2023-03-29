class Pattern7{
public static void main(String [] args)
{
boolean k;
int l;
for(int i=0; i<=5;i++)
{
l=6-i;
i=1;
k=true;
for(int j=0;j<=9;j++)
{
if(((j>=6-i) && (j<=4+i)) && k)
{
System.out.print(i);
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
