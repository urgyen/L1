package day10;

import java.util.*;

public class Collection101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection
		
		//Array?? defects>
		//fixed size
		//static size
		
		//Collection of data which stores and manipulated;
		
		
		//ArrayList
		
//		ArrayList<String> students = new ArrayList<>();
//	
//		students.add("Prabal");
//		students.add("Arun");
//		students.add("Mohan");
//		students.add("Urgyen");
//		students.add("Arun");
//		
//		
//		System.out.println(students);
//		
//		for( String data  :students) {
//			System.out.println(data);
//		}
//		
//		System.out.println(students.size());
//		//indexing maintain
//		System.out.println(students.get(4));
//		
//		//update
//		students.set(1, "Barun");
//		System.out.println(students);
		
		//HashSet
//		HashSet<Integer> set111= new HashSet<>();
//	
//		set111.add(5);
//		set111.add(10);
//		set111.add(105550);
//		set111.add(100);
//		
//		System.out.println(set111);
		
		//indexing
		//Hashing
		
		
		
		//HashMap
//		
//		100-Urgyen
//		101-Arun
//		102-Mohan
//		103-Prabal
		
		
		
		HashMap<Integer, String> hm1= new HashMap<>();
		
		hm1.put(100, "Urgyen");
		hm1.put(101, "Arun");
		hm1.put(102, "Mohan");
		hm1.put(103,"Prabal");
		
		
		for( Map.Entry m  : hm1.entrySet()  ) {
			System.out.println(m);
			System.out.println("**");
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
			System.out.println("-----");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
