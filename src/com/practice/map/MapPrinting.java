package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class MapPrinting {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");

		map.forEach((key, value) -> System.out.println(key + "-->" + value));
		System.out.println(map);
		System.out.println(map.containsKey(1));
		
		System.out.println(map.getOrDefault(6, "Eight"));
	}
}
