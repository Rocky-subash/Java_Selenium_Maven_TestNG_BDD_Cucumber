package abstract_;

public class SalarySlip {

	public static void main(String[] args) {
		Employee permanent = new PermanentEmployee("Subash","Python","Selenium",2500,40);
		Employee temperory = new TemperoryEmployee("Abitha", "java", "Playwright",1500, 40);
		
		permanent.display();
		temperory.display();

	}

}
