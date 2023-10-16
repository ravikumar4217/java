import java.io.*;
import java.util.*;
public class MatrixAdditionDemo {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int r=sc.nextInt();
		System.out.println("Enter number of columns : ");
		int c=sc.nextInt();
		int b[][]=new int[r][c];
		int a[][]=new int[r][c];
		int s[][]=new int[r][c];
		System.out.println("Enter "+(r*c)+" elements into matrix A : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter "+(r*c)+" elements into matrix B : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++ {
				s[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The resultant matrix is ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(s[i][j]+" ");
			}
				System.out.println();
		}
	}
}
