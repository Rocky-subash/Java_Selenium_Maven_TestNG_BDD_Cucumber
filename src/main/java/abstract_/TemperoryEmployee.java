package abstract_;

public class TemperoryEmployee extends Employee {
	public String programing_language;
	public  String automation;
	int hoursWorked;
	double hourlyRate;
	
	public TemperoryEmployee(String name,String programing_language,String automation, int hoursWorked,int hourlyRate) {
		super(name);
		this. programing_language = programing_language;
		this.automation = automation;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	String skills_known() {
		return programing_language+","+automation;
		
	}

	@Override
	double salary_of_employee() {
		
		return hoursWorked * hourlyRate;
	}

}
