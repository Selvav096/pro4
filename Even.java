import java.util.*;
public class Main 
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=a;i<=b;i++)
{
if(i%2==0)
System.out.print(i+" ");
}
}
}
