package com.revature.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		Map<String, Integer> newMap = new HashMap<>();
		
		newMap.put("John", 43);
		newMap.put("fred", 32);
		newMap.put("Bob", 23);
		newMap.put("George", 12);
		newMap.put("Niles", 2);
		newMap.put("Doug", 5);
		
//		newMap.forEach((k,v) -> System.out.println(k + " : " + v));
		// turns map into a set 
//		System.out.println(newMap.entrySet());
		for(Map.Entry mapElement : newMap.entrySet()) {
//			System.out.println(mapElement);
			String key = (String) mapElement.getKey();
			int value = (int) mapElement.getValue();
			System.out.println(key + " " + value);
		}
	}

}
