class Pattern1{
public static void main(String [] args)
{
boolean k;
for(int i=1;i<=9;i++)
{
k=true;
for(int j=1;j<=17;j++)
{
if(((j>=10-i) &&(j<=8+i)) && k)
{
System.out.print(i);
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