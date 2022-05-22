package com.aiman.javapractice.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoMapInterface {

	public static void main(String[] args) {
		
		Map<String,String> hashMap=new HashMap<>();  //Only Unique Keys
													// Not Thread safe
													// it is fast
													//Allows one null key
		
		hashMap.put("Name", "John");
		hashMap.put("Surname", "Cena");
		hashMap.put("Id", "6788IK");
		hashMap.put("Place", "US");

		System.out.println("fetching values using get");
		System.out.println(hashMap.get("Name"));
		
		System.out.println("fetching all keys");
		Set<String> keys=hashMap.keySet();
		
		System.out.println("fetching values using keys");

		keys.forEach((key)->{
			System.out.println(hashMap.get(key));
		});
		
		System.out.println("fetching all values");
		Collection<String> values=hashMap.values();
		
		values.forEach(System.out::println);
		
		System.out.println("fetching all entries using Entry interface");
		Set<Entry<String, String>> entries = hashMap.entrySet();
		
		for(Entry<String, String> ent:entries) {
			System.out.println("Key:"+ent.getKey()+" Value:"+ent.getValue());
		}
		
		Map<String,String> hashTable=new Hashtable<>();  //Only Unique Keys
														//Thread safe
														// it is slow
														//null key is not allowed
		
		Map<String,String> linkedHashMap=new LinkedHashMap<>();  // Elements are fetched in the same order as inserted
		
		Map<String,String> treeMap=new TreeMap<>();  // Elements are fetched in the ascending order

		
	}

}
