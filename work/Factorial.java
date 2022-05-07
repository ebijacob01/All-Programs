package work;

public class Factorial {
	
	static int fact=1;
	static int number=5;
	public static void main(String[] args) {
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
