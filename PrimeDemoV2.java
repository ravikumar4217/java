//java program to find wether the given number is prime or not.
import java.util.*;
public class PrimeDemoV2
{
public static void main(String args[]) {
    int i,num,flag=0;
    System.out.println("Enter an integer to check prime or not : ");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    for(i=2;i<=num;i++)
    {
        if(num%i==0)
        {
            System.out.println(num+" is a prime number");
            flag=1;
            break;
        }
    }
    if(flag==0)
    {
        System.out.println(num+" is not a prime number");
    }
}
}
