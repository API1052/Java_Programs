package com.homework
import java.util.*;
public class Arrayl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> a=new ArrayList<Character>();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		System.out.println("Enter the two indices.");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try {
			char b=a.get(n1);
			a.set(n1,a.get(n2));
			a.set(n2,b);
			System.out.println("After swap, Arraylist is : ");
			System.out.println(a);
		}catch (Exception e) {
			System.out.println("Please Enter index between 0 and 6.");
		}
	}
}
