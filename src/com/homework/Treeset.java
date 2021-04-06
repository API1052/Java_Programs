package com.homework;
import java.util.*;
public class Treeset {
	public static void lessthano(TreeSet<Character> t) {
		for(Character c:t) {
			if(c=='O') {
				System.out.print(c);
				break;
			}else {
				System.out.print(c+" ");
			}
		}
	}
	public static void notcontain(TreeSet<Character> t, Character c) {
		for(Character d:t) {
			if(d==c) {
				continue;

			}
			System.out.print(d+" ");
		}
	}
	public static void greaterthann(TreeSet<Character> t) {
		Boolean f=false;
		for(Character c: t) {
			if(c=='N') {
				f=true;
				continue;
			}
			if(f) {
				System.out.print(c+" ");
			}
		}
	}

	public static void main(String[] args) {
		TreeSet<Character> t=new TreeSet<Character>();
		t.add('L');
		t.add('M');
		t.add('N');
		t.add('O');
		t.add('P');
		t.add('Q');
		System.out.println("The original set is : ");
		System.out.println(t);
		Iterator<Character> i=t.descendingIterator();
		System.out.println("The reversed set is : ");
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("The set of elements that are less than or equal to the element ‘O’ : ");
		lessthano(t);
		System.out.println();
		System.out.println("The set of elements that do not contain the element ‘Q’ : ");
		notcontain(t,'Q');
		System.out.println();

		System.out.println("The set of elements that are greater than the element ‘N’ : ");
		greaterthann(t);
		System.out.println();
		System.out.println("The set of elements that do not contain the element ‘L’ : ");
		notcontain(t,'L');
	}
}