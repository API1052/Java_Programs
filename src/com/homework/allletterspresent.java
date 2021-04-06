package com.homework;
import java.util.*;

public class allletterspresent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.nextLine();
		System.out.println("Enter the second string");
		String s2=sc.nextLine();
		char[] sa1=s1.toCharArray();
		char[] sa2=s2.toCharArray();
		Boolean a=true;
		HashMap<Character,Integer> h=new

				HashMap<Character,Integer>();
		for(char c:sa1) {
			if(h.containsKey(c)) {
				h.put(c,h.get(c)+1);
			}
			else {
				h.put(c, 1);
			}
		}
		for(char d:sa2) {
			if(h.containsKey(d) && h.get(d)>0) {
				h.put(d,h.get(d)-1);
			}
			else {
				a=false;
			}
		}
		if(a) {
			System.out.println("Letters are present");
		}else {

			System.out.println("Letters are not present.");
		}
	}
}
