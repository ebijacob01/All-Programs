package week5.day2;

import java.util.HashSet;

public class PrintUnique {
	public static void main(String[] args) {
		
		HashSet<Character> type=new HashSet<Character>();
		type.add('b');
		type.add('a');
		type.add('b');
		type.add('u');
		type.add('b');
		type.remove('b');
		System.out.println(type);
	}

}
