package com.mh.coding.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LoopAndVar {

	public static void sysout(String k, String v) {
		System.out.println("key = " + k + ", value = " + k);
	}

	public static void main(String[] args) {

		String[] arr = new String[5];

		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		arr[4] = "E";

		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		for(String s : list) {
			System.out.println(s);
		}

		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");

		for(String s : set) {
			System.out.println(s);
		}

		Map<String,String> map = new HashMap<>();
		map.put("1","A");
		map.put("2","B");
		map.put("3","C");
		map.put("4","D");
		map.put("5","E");

		int count = 0;

		for(String k : map.keySet()) {
			System.out.println("count = " + count++);
			System.out.println(map.get(k));
		}

		count = 0;

		final int X = 0;

		int[] AX = new int[1];

		// Lambda 문법
		// forEach  (일반 변수 : int , long, double, String 변경하는 코드 작성)
		map.forEach((k,v) ->{
			System.out.println("count = " + AX[0]++);
			System.out.println("key = " + k + ", value = " + map.get(k));
		});


	}

}
