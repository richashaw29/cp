import java.util.*;
class p27
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int t=65;
for(int i=1;i<=n;i++)
{
    
    int m=t;
for(int j=1;j<=i;j++)
{
System.out.print((char)m);
m--;
}
t++;
System.out.println("  ");
}
sc.close();
}
}