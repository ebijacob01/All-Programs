package work;

public class Fibonacci {
	public static void main(String[] args) {
		
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		for(int i=0;i<=10;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
