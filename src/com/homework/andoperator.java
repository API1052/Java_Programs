package com.homework;
import java.util.*;

public class andoperator {
	public static void main(String []args){
		int a=0;
		int b=1;
		while(a<=100 && b<=101){
		System.out.print(a);
		System.out.print(" & ");
		System.out.print(b+" = ");
		System.out.println(a&b);
		a+=2;
		b+=2;
		}
		}
}
