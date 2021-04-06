package com.homework;
import java.util.*;

public class threematrixmultiply {
	public static int[][] multi(int[][] a,int[][] b,int m1,int n1,int m2,int n2){
		int[][] r=new int[m1][n2];
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				r[i][j]=0;
				for(int k=0;k<n1;k++) {
					r[i][j]=r[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m1=0,n1=0,m2=0,n2=0,m3=0,n3=0;
		System.out.println("Enter the number of rows and columns of first matrix.");
		m1=sc.nextInt();
		n1=sc.nextInt();
		int[][] a=new int[m1][n1];
		System.out.println("Enter the first matrix.");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the number of rows and columns of second matrix.");
		m2=sc.nextInt();
		n2=sc.nextInt();
		int[][] b=new int[m2][n2];
		System.out.println("Enter the second matrix.");
		for(int i=0;i<m2;i++) {
			for(int j=0;j<n2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the number of rows and columns of third matrix.");

		m3=sc.nextInt();
		n3=sc.nextInt();
		int[][] c=new int[m3][n3];
		System.out.println("Enter the third matrix.");
		for(int i=0;i<m3;i++) {
			for(int j=0;j<n3;j++) {
				c[i][j]=sc.nextInt();
			}
		}
		int[][] res=new int[m1][n3];
		int[][] res1=new int[m1][n2];
		if(n1==m2 && n2==m3){
			res1=multi(a,b,m1,n1,m2,n2);
			res=multi(res1,c,m1,n2,m3,n3);
		}
		System.out.println("The resultant mtrix is :");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n3;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
