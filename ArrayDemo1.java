import java.io.*;
public class ArrayDemo1
{
    public static void main(String args[])
    {
        int a[];    //Declaration - 'a' is an array of type integer
        a = new int[5];  //instantiation
        a[0] = 11;
        a[1] = 22;          //initilization
        a[2] = 33;
        a[4] = 55;
        System.out.println("The array elements are : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
