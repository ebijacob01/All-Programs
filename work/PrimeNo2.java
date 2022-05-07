package work;


public class PrimeNo2 {
	public static void main(String[] args) {
		
//		Scanner scr =new Scanner(System.in);
//		System.out.print("start ");
//		int a=scr.nextInt();
//		System.out.print("End ");
//		int b=scr.nextInt();
//		int[] no=new int[] {12,2};
    	for (int j = 1;j<=10; j++) {
			
			int num = j;
			int count=0;
			for (int i = 1; i <=num; i++) {
				
				if (num%i==0){
				count++;
			}
			}
			if (count==2) {
		System.out.print(" "+num);
			}
    	}
		System.out.println(" ");
		}
}