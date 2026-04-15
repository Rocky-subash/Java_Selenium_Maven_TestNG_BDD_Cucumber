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
		
		/*
		 * Static method can be called within the class without creating a object for the class
		 * inorder to call a static method from one calls to another class   in the other call user classname.static method name 
		 * Static method is used when we need to create a utility method or a helper method 
		 * We cannot call a non static variable into a static function 
		 * we can call a static variable into a non static function 
		 * This keyword which is used to access the instace variable of a class cannot be used inside a static function or main function
		 */

	}

}
