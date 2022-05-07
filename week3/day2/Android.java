package week3.day2;

public class Android implements Samsung{

	public void Gary() {
		// TODO Auto-generated method stub
		System.out.println("Gary Anto");
	}

	public void Muthu() {
		// TODO Auto-generated method stub
		System.out.println("Muthu Jagadesh");
	}
	
	public void createNote() {
		System.out.println("Create Note");
	}
	public static void main(String[] args) {
		Android type=new Android();
		type.Gary();
		type.Muthu();
		type.createNote();
	}
       
	
}
