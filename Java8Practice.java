package com.tcs.jfd.java8practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Practice {
	public static void main(String[] args) {
		List<String> stringL = Arrays.asList("apple", "hi", "banana", "cat", "elephant");
		List<String> res = stringL.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
		System.out.println("10) Reverse sort Strings by length");
		System.out.println(res);
		System.out.println();
		
		List<Integer> IntList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> res1 = IntList.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("11) Sqauring Numbers");
		System.out.println(res1);
		System.out.println();
		
		List<String> stringL1 = Arrays.asList("apple", "hi", "banana", "cat", "elephant");
		String res2 = stringL1.stream().collect(Collectors.joining());
		System.out.println("12) Joining Strings");
		System.out.println(res2);
		System.out.println();
		
		List<String> strings = Arrays.asList("one", "two", "three", "four", "eight", "six");
		Map<Integer, List<String>> res03 = strings.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("13) group by length Strings");
		System.out.println(res03);
		System.out.println();
		
		List<Integer> minInt = Arrays.asList(1,2,3,4,5,6);
		Integer res3 = minInt.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("14) min integer");
		System.out.println(res3);
		System.out.println();

		List<Integer> secMaxInt = Arrays.asList(1,2,3,4,5,6);
		List<Integer> res4 = secMaxInt.stream()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.limit(1)
				.collect(Collectors.toList());
		System.out.println("15) Second max Elements");
		System.out.println(res4);
		System.out.println();
		
		String str = "banana";
		Map<Character, Long> res5 = str.chars().mapToObj(c->(char) c)
									.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println("16) Characters frequency");
		System.out.println(res5);
		System.out.println();
		
		String str1 = "madam";
		boolean isPalindrome = IntStream.range(0, str1.length() / 2)
		    .allMatch(i -> str1.charAt(i) == str1.charAt(str1.length() - 1 - i));	
		System.out.println("17) Palindrome check");
		System.out.println(isPalindrome);
		System.out.println();
		
		
		List<Integer> descOrder = Arrays.asList(6,5,4,3,2,1);
		List<Integer> res6 = descOrder.stream().sorted((x,y)->x.compareTo(y)).collect(Collectors.toList());
		System.out.println("18) sorting list");
		System.out.println(res6);
		System.out.println();
		
		List<Integer> dups = Arrays.asList(6,5,4,4,5,1,2);
		Set<Integer> res7 = new HashSet<>();
		dups.stream().map(x->!res7.add(x)).collect(Collectors.toList());
		System.out.println("19) Remove Duplicate");
		System.out.println(res7);
		System.out.println();
		
		String str2 = "abcdefa";
		Optional<Character> firstRepeated = str2.chars()
		    .mapToObj(c -> (char) c)
		    .filter(c -> str2.indexOf(c) != str2.lastIndexOf(c))
		    .findFirst();
		System.out.println("20) First repeated characters in list");
		System.out.println(firstRepeated);
		
		
		


		

	}

}
