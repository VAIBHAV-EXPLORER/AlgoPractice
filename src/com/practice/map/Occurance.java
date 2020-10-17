package com.practice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String st=in.next();
		st=st.toLowerCase();
		Map<Character,Integer> map=new HashMap<>();
		//int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);

	}

}
