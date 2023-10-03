import java.io.*;
public class ArrayReturningDemo {
    static int[] max() {
    return new int[]{10,20,30,40,50,100};
    }
      public static void main(String args[])
      {
      int arr[] = max();
      int m = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(m<arr[i]){
                m = arr[i];
          }
        }
        System.out.println("The largest element in the array is "+m);
    }
}
