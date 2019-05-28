import java.util.*;
public class Main
{public static void main(String args[])
{
Scanner s=new Scanner (System.in);
int a=s.nextInt(),c=s.nextInt(),d=0;
int[] b=new int[a];
for(int i=0;i<a;i++)
{b[i]=s.nextInt();}
for(int i=0;i<c;i++)
{d=d+b[i];}
System.out.print(d);}}
