import java.io.*;
import java.util.*;
 public class ArrayElementsSum1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" values into the array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]%2==0){
				sum=sum+a[i];
			}}
		System.out.println("Sum of only even elements : "+sum);
		for(int i=0;i<n;i+=2){
			sum=sum+a[i];
	}
	}
     }
