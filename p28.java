import java.util.*;
class p28
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int m=1;
int n=0;
for(int i=1;i<=t;i++)
{
    n=m+i;
for(int j=1;j<=2*i-1;j++)
{
    
if(j%2==0)
System.out.print("*");

else
{
if(i%2==0)
System.out.print(--n);
else
System.out.print(m);
                                  
m++;

}
}
System.out.println();
}



}

}