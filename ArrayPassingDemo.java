import java.io.*;
class ArrayPassingDemo {
    static void min(int arr[]) {
        int m = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(m>arr[i]){
                m = arr[i];
            }
        }
        System.out.println("The smallest element in the array is "+m);
    }
    public static void main(String args[])
    {
        int a[] = {11,22,33,44,2,1,5,7};
        min(a);
    }
}
