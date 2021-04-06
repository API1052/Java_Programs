package com.homework;

import java.util.*;

public class Hashm{
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(4, "Kerala");
		h.put(3, "Tamil Nadu");
		h.put(5, "Karnataka");
		h.put(1, "Maharashtra");
		h.put(2, "Telangana");
		System.out.println("The original hashmap is : ");
		System.out.println(h);
		System.out.println();
		System.out.println("The reversed hashmap is : ");
		List<Integer> k=new ArrayList<Integer>(h.keySet());
		Collections.reverse(k);
		for (Integer l:k) {
			System.out.print(l+"="+h.get(l)+" ");
		}
		System.out.println();
		System.out.println();

		System.out.println("The set of elements that are less than or equal to the key ‘3’ : ");
		for(Integer i:h.keySet()) {
			if(i<=3) {
				System.out.print(i+"="+h.get(i)+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("The set of elements that do not contain key '2' & '5' : ");
		for(Integer i:h.keySet()) {
			if(i!=2 && i!=5) {
				System.out.print(i+"="+h.get(i)+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("The set of elements that are greater than the key ‘3’ : ");

		for(Integer i:h.keySet()) {
			if(i>3) {
				System.out.print(i+"="+h.get(i)+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("The set of elements that are lesser than or equal to the value

				‘Maharashtra’ : ");

					for(Integer i:h.keySet()) {
						if(h.get(i).equals("Maharashtra")) {
							System.out.print(i+"="+h.get(i)+" ");
							break;
						}else {
							System.out.print(i+"="+h.get(i)+" ");
						}
					}
		System.out.println();
		System.out.println();
		System.out.println("The set of elements that are greater than the value ‘Karnataka’ : ");
		Boolean c=false;
		for(Integer i:h.keySet()) {
			if(h.get(i).equals("Karnataka") && i!=5) {
				c=true;
				continue;
			}
			if(c) {
				System.out.println(i+"="+h.get(i)+" ");
			}else {
				System.out.print("null");
				break;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("The set of elements that does not contain the value ‘Kerala’ and

				‘Telangana’ : ");

					for(Integer i:h.keySet()) {
						if(h.get(i).equals("Kerala") || h.get(i).equals("Telangana")) {
							continue;
						}else {
							System.out.print(i+"="+h.get(i)+" ");

						}
					}
	}
}O
