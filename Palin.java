import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner s=new Scanner (System.in);
int a=s.nextInt(),r=0,d,t=a;
if(a>0)
{
while (a>0)
{
d=a%10;r=r+d;a=a/10;
}
if(t==r)
System.out.print("yes");
else 
System.out.print("no");}
else{
System.out.print("Invalid Input");
}}}
