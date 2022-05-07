package workout;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		
		char[] name= "dharani kumar".toCharArray();
		
		Set<Character> typ=new LinkedHashSet<Character>();
		for (Character type : name) {
			typ.add(type);
			System.out.println(typ.toString());
			
		}
	}

}
