package work;

public class Remove {
	public static void main(String[] args) {
		
		String  act="We learn java basics as part of java sessions in java  week1";
		String[] each=act.split("");
		for(int i=0;i<each.length;i++) {
			int count=1;
			for(int j=i+1;j<each.length;j++) {
				if(each[i]==each[j]) {
					count++;
				}
				}
			if(count>1) {
				System.out.println(each[i]);
			}
		}	
	}
}
