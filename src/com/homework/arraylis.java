package com.homework;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylis{
	public static int mylen(String s) {
		char[] ch=s.toCharArray();
		int len=0;
		for(char c:ch) {
			len+=1;
		}
		return len;
	}
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int ind=0;
		System.out.println("Enter the number of words.");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			a.add(sc.next());
		}
		for(String s:a) {
			System.out.println("Number Of Characters at Index "+ind+" : "+mylen(s));
			ind++;
		}
	}
}
