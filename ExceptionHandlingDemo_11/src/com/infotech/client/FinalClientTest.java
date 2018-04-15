package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

import com.infotech.model.Person;

public class FinalClientTest {

	public static void main(String[] args) throws ClassNotFoundException  {
		
		final int data= 100;
		System.out.println(data);
		//data = 200;//compilation error
		
		Person person = new Person("Sean", "Murphy");
		System.out.println(person);
		
		final List<String> list = new ArrayList<>();
		list.add("KK");
		list.add("PK");
		for (String name : list) {
			System.out.println(name);
		}
		//list = new  ArrayList<>();//compilation error
	}

}
