class Pattern2{
public static void main(String [] args)
{
boolean k;
int l=0;
for(int i=1;i<=9;i++)
{
l=1;
k=true;
for(int j=1;j<=17;j++)
{
if(((j>=10-i) &&(j<=8+i)) && k)
{
System.out.print(l);
k=false;
l++;
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