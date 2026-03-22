package java_practice;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading cell = new MethodOverloading();
		String CustomerName = "Subash";
		System.out.println(cell.Calling(CustomerName));
		System.out.println(cell.Calling(8680835412l));
		System.out.println(cell.Salary(100000, CustomerName));
	}
	
	public String Calling(String CustomerName) {
		return "Calling customer " + CustomerName;	 
		
	}
	public long Calling(long Number) {
		return Number;
		
	}
	public String Salary(int Salary,String CustomerName) {
		return CustomerName + "Salary is  "+Salary;
	}

}
