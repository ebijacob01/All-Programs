package workout;

//import java.awt.List;
import java.util.Set;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Iterator;
import java.util.LinkedHashSet;
//import java.util.LinkedList;


public class RemoveDuplicate {
	public static void main(String[] args) {
		
		Integer[] num= {10,20,30,40,10,30,60,70,30};
		//LinkedHashSet<Integer> number = new LinkedHashSet<Integer>(Arrays.asList(num));
		//System.out.println(number);
		Set<Integer> number = new LinkedHashSet<Integer>();
		
		for(Integer integer : num) {
			number.add(integer);
		}
		System.out.println(number);
		
//	    for(Integer integer2 : num) {
//		if(!number.add(integer2)) {
//			System.out.println(number);
//		}
//	    }
//		for(int i=0; i<num.length;i++) {
//			int count=1;
//			for(int j=i+1; j<num.length;j++) {
//				if(num[i]==num[j]) {
//					count++;
//				}
//			}
//			if(count>1) {
//				System.out.println(num[i]);
//			}
			for(int i=0;i<num.length;i++)
				for(int j=i+1;j<num.length;j++) {
					if(num[i]==num[j]) {
						
						System.out.println(num[i]);
					}
				}
			}
		
	
	}
