package workout;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		
		char[] name="paypal india".toCharArray();
		
		Set<Character> type=new LinkedHashSet<Character>();
		for (char typ : name) {
			   type.add(typ);
		System.out.println(type.toString().replaceAll("[^a-zA-Z0-9]", ""));	   
			
		}
		
	
}
}
