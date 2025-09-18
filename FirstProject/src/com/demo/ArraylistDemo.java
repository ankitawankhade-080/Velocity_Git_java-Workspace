package com.demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		
	   List<String> list=new ArrayList<String>();
	   list.add("pune");
	   list.add("mumbai");
	   list.add("banglore");
	   list.add("hydrabad");
	   
	   System.out.println(list);
	   
	  Iterator<String> itr= list.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
	 
	}

}
