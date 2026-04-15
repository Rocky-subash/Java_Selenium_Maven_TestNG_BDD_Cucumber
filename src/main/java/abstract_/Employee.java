package abstract_;

public abstract class Employee {
	 //instance variable 
	
	String name ;
	
	//static variable 
	static int  max_experience = 20;
	
	//final variable
	final int age = 100;
	
	Employee(String name){
		this .name = name;
		System.out.println("I am "+ name +" a automation testing enginerr"); 
	}
	
	abstract String  skills_known();
	
	abstract double salary_of_employee();
	
	void degree(String degree) {
		System.out.println("Computer science engineeer");	
	}
	
	static void employee_experience() {
		System.out.println(max_experience);
		//System.out.println(name);  cannot make a  static regrence to a non static field name 
	}
	final void age_of_employee(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	void display() {
		System.out.println("Name "+name);
		System.out.println("Skills know "+ skills_known() );
		System.out.println("Salary "+ salary_of_employee() );
	}

	}

