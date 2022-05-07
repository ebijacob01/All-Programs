package week2.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int[] name= {1,5,2,};
		int[] name1= {5,7,2};
		
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name1.length;j++) {
				if(name[i]==name1[j]) {
					System.out.println(name[i]);
				}
			}
		}
	}

}
