package com.homework;

import java.util.Scanner;
class A{
	public int addition(int a,int b) {
		return a+b;
	}
	public int subtraction(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public float division(int a,int b) {
		return (float)a/b;
	}
	public int modulus(int a,int b) {
		return a%b;
	}
	public int post_increment(int a) {
		return a++;
	}
	public int post_decrement(int a) {
		return a--;
	}
	public int pre_increment(int a) {
		return ++a;
	}
	public int pre_decrement(int a) {
		return --a;
	}
}

class B extends A{
	public int and(int a,int b) {
		return a&b;
	}
	public int or(int a,int b) {
		return a|b;
	}
	public int xor(int a,int b) {
		return a^b;
	}
	public int complement(int a) {
		return ~a;
	}
	public int left_shift(int a) {
		return a<<1;
	}
	public int right_shift(int a) {
		return a>>1;
	}

}
public class inheritance extends B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number.");
		int a=sc.nextInt();
		System.out.println("Enter the second number.");
		int b=sc.nextInt();
		inheritance c=new inheritance();
		System.out.println("Arithmetic Operator : ");
		System.out.println("a+b = "+c.addition(a, b));
		System.out.println("a-b = "+c.subtraction(a, b));
		System.out.println("a*b = "+c.multiplication(a, b));
		System.out.println("a/b = "+c.division(a, b));
		System.out.println("a%b = "+c.modulus(a, b));
		System.out.println("a++ = "+c.post_increment(a));
		System.out.println("a-- = "+c.post_decrement(a));

		System.out.println("++a = "+c.pre_increment(a));
		System.out.println("--a = "+c.pre_decrement(a));
		System.out.println("Bitwise Operators : ");
		System.out.println("a&b = "+c.and(a, b));
		System.out.println("a|b = "+c.or(a, b));
		System.out.println("a^b = "+c.xor(a, b));
		System.out.println("~b = "+c.complement(b));
		System.out.println("a<<1 = "+c.left_shift(a));
		System.out.println("a>>1 = "+c.right_shift(a));
	}
}
