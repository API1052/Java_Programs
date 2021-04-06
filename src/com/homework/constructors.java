package com.homework;
import java.util.*;

class example{
	example(int id,int age){
		System.out.println("id = "+id);
		System.out.println("age = "+age);
	}
	example(int id,int age,String name){
		System.out.println("id = "+id);
		System.out.println("age = "+age);
		System.out.println("name = "+name);
	}
}

public class constructors {
	public static void main(String []args){
		System.out.println("Constructor with two parameters : ");
		example a=new example(1023,23);
		System.out.println("Constructor with three parameters : ");
		example b=new example(1045,21,"John");
		}
}
