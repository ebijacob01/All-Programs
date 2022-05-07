package week5.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class MissingNo {
	public static void main(String[] args) {
		
		Set<Integer> numbers=new HashSet<Integer>();
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(9);
		numbers.add(10);
		numbers.add(8);
		numbers.add(8);
		numbers.add(6);
		System.out.println(numbers);
		
		for(int i=0; i<numbers.size(); i++) {
			
			System.out.println(i);
			
		}
		
		
		
	}

}
