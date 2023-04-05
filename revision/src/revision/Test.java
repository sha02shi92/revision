package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Test {
	public static void main(String[] args) {

//		1) remove special characters
//		String str="hello#@shashank*/";
//		str=str.replaceAll("[^a-zA-z0-9]", " ");   
//		System.out.println(str);

		// 2) remove white spaces
//		String str="shas   han   k  gajb   hiye";
//		str=str.replaceAll("\\s", "");    
//		System.out.println(str);

		// 3) sorting the String

//		String str= "rock";
//		char[] array = str.toCharArray();
//		char temp;
//		for(int i=0; i<str.length(); i++) {
//			for(int j=i+0; j<str.length(); j++) {
//				if(array[i] > array[j]) {
//					temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//				}
//			}
//		}
//		System.out.println(new String(array));
//		System.out.println(array);       valid

		// 4) replace the string with its occurence

//		String str = "opentext";
//		char replace = 't';
//		if (str.indexOf(replace) == -1) {
//			System.out.println("character which you want to replace is not available..");
//			System.exit(0);
//		}
//		int count = 1;
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (c == replace) {
//				str = str.replaceFirst(String.valueOf(replace), String.valueOf(count));
//				count++;
//
//			}
//		}
//		System.out.println(str);

		// 5) reverse the string
//		
//		String str="shashank";
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}

		// 6) swapping of the two numbers

//		int a=45;
//		int b=36;
//		int temp;
//		System.out.println("Before swapping the numbers are : " + a + " and " + b );
//		temp=a;
//		a=b;
//		b=temp;

		// without using the third variables
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swapping the numbers are : " + a + " and " + b);

//		7) Write a Java Program to count the number of words in a string using HashMap.

//		        String str1="This this shashank is is done by by shashank shashank";
//		        HashMap<String , Integer> wordsCount=new HashMap<>();
//		        String[] split = str1.split(" ");
//		        for(String word : split) {
//		        	if(wordsCount.containsKey(word)) {
//		        		wordsCount.put(word, wordsCount.get(word) + 1);
//		        	}else {
//		        		wordsCount.put(word, 1);
//		        	}
//		        }
//		        System.out.println(wordsCount);

//        8)Write a Java Program to iterate HashMap using While and advance for loop

		// creating the hashmap
//		HashMap<String, Integer> employeeAgeMap=new HashMap<>();
//		
//		employeeAgeMap.put("John", 35);
//        employeeAgeMap.put("Mary", 28);
//        employeeAgeMap.put("Bob", 42);
//        employeeAgeMap.put("Alice", 31);
//        
//        Iterator<Map.Entry<String, Integer>> iterator = employeeAgeMap.entrySet().iterator();

		// iterate by using the while loop
//        while(iterator.hasNext()) {
//        	Map.Entry<String, Integer> next = iterator.next();
//        	System.out.println(next.getKey() + " -> " + next.getValue());
//        }
//        System.out.println();

		// iterate by using the advanced loop
//		for(Map.Entry<String, Integer> next1:employeeAgeMap.entrySet()) {
//			System.out.println(next1.getKey() + " -> " + next1.getValue());

//	}

//		9) wap to find the prime number or not using java 8

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int number = sc.nextInt();
//		
//		boolean isPrime = IntStream.rangeClosed(2, number/2).noneMatch(i->number % 2==0);
//		        if(isPrime) {
//		        	System.out.println("It is prime number");
//		        }else {
//		        	System.out.println("It is not a prime number");
//		        }

//		String str="shashank gajbhiye";
//		
//		String result=str.chars()
//				         .distinct()
//				         .mapToObj(c->String.valueOf((char)c))
//				         .collect(Collectors.joining());
//		System.out.println(result);

		// find the duplicates using the hashmap

//	public static <T> Set<T> findDuplicates(T[] array) {
//		Map<T, Boolean> map = new HashMap<>();
//		Set<T> duplicates = new HashSet<>();
//
//		for (T element : array) {
//			if (map.containsKey(element)) {
//				duplicates.add(element);
//			} else {
//				map.put(element, true);
//			}
//		}
//
//		return duplicates;
//	}
//
//	public static void main(String[] args) {
//
//		Integer[] numbers = { 1, 2, 3, 2, 4, 5, 3, 5, 1, 4 };
//
//		Set<Integer> duplicates = findDuplicates(numbers);
//
//		System.out.println("Duplicate elements available in the Integer array: " + duplicates);

//		star pattern below code
		
//		int n = 4;
//		for (int i = 0; i <= n; i++) {
//			
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		majority element in the array
		
//		int a[]= {1,2,3,4,5,2,3,3,3};
//		System.out.println("Majority Element=" + majorityElement(a, 10));
//	}
//	      static int majorityElement(int a[], int size) {
//	    	  Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//	    	  for(int i:a) {
//	    		  Integer val=map.get(i);
//	    		 if(val==null) {
//	    			  map.put(i,1);
//	    		  }else
//	    		  {
//	    			  map.put(i, val+1);
//	    		  }
//	    	  }
//	    	  for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//	    		  if(entry.getValue()>size/2) {
//	    			  return entry.getKey();
//	    		  }
//	    	  }
//			return -1;	
		
		
//		missing number of an array
		
//		int a[]= {0,1,2,4,5,7,8};
//		missingNumber(a);
//	}
//	public static void missingNumber(int a[]) {
//		HashSet<Integer> set=new HashSet<Integer>();
//		for(int num:a) {
//			set.add(num);
//		}
//		int n=a.length+1;
//		for(int i=0;i<n; i++) {
//			if(!set.contains(i)) {
//				System.out.println(i);
//			}
//		}
		
//		COUNT THE OCCERENCE OF THE EACH CHARACTER IN THE STRING
		
		String s="shashankgajbhiye";
		         Map<String, Long> collect = Arrays.stream(s.split(""))
		        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		        System.out.println(collect);
		
		
//		FIND THE DUPLICATE OF THE STRING
		        
		String s1="shashankgajbhiye";
	 List<String> collect2 = Arrays.stream(s1.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(x->x.getValue()>1)
//		.filter(x->x.getValue()<1)
//		.filter(x->x.getValue()==1)	
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
//		.collect(Collectors.joining());
		System.out.println(collect2);
		
//		 FIND THE NON REPEATED VALUE OF THE STRING
		
		String s2="shashankgajbhiye";
		 String key = Arrays.stream(s2.split(""))
					.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
					.entrySet().stream()
					.filter(a->a.getValue()==1)
					.findFirst().get().getKey();
		 System.out.println(key);
		
//		  FIND THE SECOND HIGHEST NUMBERS
		 
		 int[] a= {1,2,4,6,9,15,30};
		 
		 Integer integer = Arrays.stream(a).boxed()
		 .sorted(Comparator.reverseOrder())
//		 .sorted()    // if we want the second lowest numbers
		 .skip(1)
		 .findFirst()
		 .get();
		 System.out.println(integer);
		 
//		 FIND THE LARGEST LENGTH OF THE STRING
		 
		 String[] str= {"shashi","java","shashank", "spring","microservices"};
		 
		 String string = Arrays.stream(str)
		 .reduce((word1, word2)->word1.length()>word2.length()?word1:word2)
		 .get();
		System.out.println(string);
		
		
//		FIND THE NUMBER WHICH EACH STARTS WITH 1
		
		int[] number= {1,2,7,10,14,19,25,30,31,32,39};
		
		List<String> collect3 = Arrays.stream(number).boxed()
		.map(z -> z+"")
		.filter(z->z.startsWith("3"))
		.collect(Collectors.toList());
		System.out.println(collect3);
		 
//		STRING.JOIN METHOD
		
		List<String> num=Arrays.asList("1","2","3","4");
		
		String join = String.join("-", num);
		System.out.println(join);
		
//		skip and limit example(2-9)
		
		IntStream.rangeClosed(1, 9)
		.skip(1)
		.limit(8)
		.forEach(System.out::print);
		
		
//		REMOVE DUPLICATE CHARACTER USING THE STREAM API
		
		
		
		
		
		
		
		
	}
}
