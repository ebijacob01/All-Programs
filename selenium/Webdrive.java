package selenium;

public class Webdrive {
	
	  public static void main(String[] args) {
		int[]no= {1,2,3,4,5,6,7,8,9,10};
		for (int i = 1; i < no.length; i++) {
			if(no[i]%2==0) {
				System.out.println("oddno"+" "+ i);
			}
			if(no[i]%2==1) {
				System.out.println("even no"+" "+ i);
			}

			
		}
	}
}