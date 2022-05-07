package workout;

public class Test4 {
	public static void main(String[] args) {
		int [] num= {2,4,5,6,8,9,2,4,5};
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
				num[j]=99;
				}
			}
				if(num[i]!=99) {
					System.out.println(num[i]);
				}
			}
		}
	}
