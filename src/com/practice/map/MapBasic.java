package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		System.out.println(map.get(2));
		
		System.out.println(map.get(3));
		
		System.out.println(map.getOrDefault(3, "Default Value"));
		map.put(2, "Three");
		System.out.println(map.get(2));
		
	}
}
