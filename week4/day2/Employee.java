package week4.day2;

public class Employee{
	String employeeName;
	String companyName;
	int employeeId;
	double employeeSalary;
	boolean isActive;
	
	Employee(){
	    System.out.println("default constructor");
	}
	Employee(String name,String company,int id){                      //overload
		this();
		this.employeeName=name;
		this.companyName=company;
		this.employeeId=id;
		System.out.println("parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		Employee a=new Employee();
		System.out.println(a.employeeName);
		System.out.println(a.companyName);
     	System.out.println(a.employeeId);
		System.out.println(a.employeeSalary);
		System.out.println(a.isActive);
		
		Employee b=new Employee("gary","Testleaf",26);
		System.out.println(b.employeeName);
		System.out.println(b.isActive);
		
		
		
	}

}
