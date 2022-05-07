package week5.day2;

import java.util.LinkedList;

public class LearnLinked {
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		name.add("Anup");
		name.add("Mani");
		name.add("Ajeesh");
		name.add("Kavin");
		name.add("Nithish");
		for (String value : name) {
			System.out.println(value);
		}
		
		System.out.println(name);
	}

}
