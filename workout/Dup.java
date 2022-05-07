package workout;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dup {
	public static void main(String[] args) {
		int [] num = {10,20,30,40,10,30,60,10,30};
//		
		Set<Integer> val3 = new LinkedHashSet<Integer>();
		for(Integer num2 : num) {
			val3.add(num2);	                             //Remove Duplicate
		}
		System.out.println(val3);
		
//		Set<Integer> val2 = new LinkedHashSet<Integer>();
//		Set<Integer> val = new LinkedHashSet<Integer>();
//		for (Integer number : num) {
//			if(!val.add(number)) {
//				System.out.println(number);                 //show Dup and Remove Another Dup
//				val2.add(number);
//			}
//		}
//		System.out.println(val2);
//	}
//}

		
//String [] a= {"*","*","*","*","*","*"};		
//LinkedList<String> val3 = new LinkedList<String>();
//for(String num2 : a) {
//	val3.add(num2);	  
//	System.out.println(val3);   //Remove Duplicate
//}
//System.out.println(val3);
}}
