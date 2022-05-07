package selenium;

import java.util.LinkedHashSet;
import java.util.Set;

public class Drp {
	public static void main(String[] args) {
		int [] num = {10,20,30,40,10,30,60,10,30};
		
		Set<Integer> val2 = new LinkedHashSet<Integer>();
		Set<Integer> val = new LinkedHashSet<Integer>();
		for (Integer number : num) {
			if(!val.add(number)) {
				//System.out.println(number);                 //show Dup and Remove Another Dup
				val2.add(number);
			}
		}
		System.out.println(val2);
		
	}

}
