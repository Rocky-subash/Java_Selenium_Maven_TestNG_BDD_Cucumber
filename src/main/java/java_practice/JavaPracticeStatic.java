package java_practice;

public class JavaPracticeStatic {
	
	static int a=10;
	static int b = 5;
	
	public static int sum() {
		return(a+b);		
		
	}
	
	void counter() {
		a++;
		b++;
		System.out.println("interger a  " + a + " interger b " +b);
	}

	public static void main(String[] args) {
		JavaPracticeStatic obj = new JavaPracticeStatic();
		obj.counter();
		obj.counter();
		
		
		JavaPracticeStatic obj1 = new JavaPracticeStatic();
		obj1.counter();
		obj1.counter();
		
		System.out.println(sum());

	}

}
