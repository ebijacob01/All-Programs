package week5.day2;

import java.util.ArrayList;
import java.util.Collections;

public class List {
	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("Radha");
		name.add("Muthu");
		name.add("Gary");
		name.add("Ebi jacob");
		for(String value : name) {
			System.out.println(value);
		}
		
		name.remove("Ebi jacob");
		System.out.println(name);
		System.out.println(name.contains("Gary"));
		System.out.println(name.size());
		//name.clear();
		System.out.println(name.isEmpty());
		System.out.println(name.get(1));
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
	}
}
