
import java.util.*;
import java.lang.Math;
public class Main
{
public static void main(String args[])
{
int a,b,c,d=0,e=0,f,g;
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
c=a;f=a;
while(a>0)
{a=a/10;
d=d+1;

}
while(c>0)
{
g=c%10;
e+=Math.pow(g,d);
c=c/10;
}
if(f==e) 
System.out.println("yes");
else
System.out.println("no");
}
}
}
