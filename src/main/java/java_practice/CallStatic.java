package java_practice;

public class CallStatic {

	public static void main(String[] args) {
		
		String a = "10";
		String b = "20";
		int e = 5;
		
		int c = Integer.parseInt(a);
		//Integer.parseInt is used in to change string datatype into integer data type  	
		int d = Integer.parseInt(b);
		
		String f = Integer.toString(e);
		System.out.println(f);
		System.out.println(a+b);
		System.out.println(c+d);				
		
		JavaPracticeStatic.sum();
		

	}

}
