import java.io.*;
public class ArrayNameDemo {
	public static void main(String args[]) {
		int arr[]={11,22,33,44,55};
		Class c=arr.getClass();
		String name=c.getName();
		System.out.println("The class name of the array is "+name);
    }
}
