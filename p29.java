import java.util.*;
class p29
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
       int k=64;

       for(int i=1;i<=n;i++)
    {
 k=k+i;
 int l=k;
        
        for(int j=1;j<=n;j++)
    {  
     
if(j>=n-i+1)
System.out.print((char)l+" ");
else
System.out.print(" ");

    }

System.out.println();
    }
    
    sc.close();
    }

}