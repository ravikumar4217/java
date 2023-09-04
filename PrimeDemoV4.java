//Java program to find list of prime numbers in given range.
import java.util.*;
public class PrimeDemoV4

{
public static void main(String args[]) {
    int s1,s2,s3,i,j,num,flag;
    Scanner sc = new Scanner(System.in);
    
    System.out.println ("Enter the upper limit :"); 
    s1 = sc.nextInt();
    for(i=2;i<=s1;i++)
    {
        flag=0;
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
                flag=1;
                break;
            }
        }
         if(flag==0)
        {
            System.out.println(i+" is a prime number");
        }
    }
}
}
