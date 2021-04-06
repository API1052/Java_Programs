package com.homework;
import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
	public static int mylen(String s) {
		char[] ch=s.toCharArray();
		int len=0;
		for(char c:ch) {
			len+=1;
		}
		return len;
	}
	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of pairs.");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String a=sc.next();
			String b=sc.next();
			h.put(Integer.parseInt(a),b);
		}
		for(int l:h.keySet()) {
			sum+=l;
		}
		System.out.println("Sum of the Keys : "+sum);
		for(int l:h.keySet()) {
			System.out.println("The number of characters in key "+l+" is"+mylen(h.get(l)));
		}
	}
}