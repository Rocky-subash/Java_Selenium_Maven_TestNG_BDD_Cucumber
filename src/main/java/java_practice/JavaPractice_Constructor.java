package java_practice;

public class JavaPractice_Constructor {
	
	String name;
	byte age ;
	float weight ;
	double height;
	long phoneNumber;
	int number;
	short salary ;
	char initial ;
	boolean liked ;
	
	public JavaPractice_Constructor() {
		
	}
	void display() {
		System.out.println("the name is ->> " +this.name);
		System.out.println("The age is ->> "+this.age);
		System.out.println("The weight is ->> "+this.weight);
		System.out.println("The height is ->> "+this.height);
		System.out.println("the phoneNumber is ->>"+this.phoneNumber);
		System.out.println("The number is ->> "+this.salary);
		System.out.println("The initial is ->> "+this.initial);
		System.out.println("This is liked ->> "+this.liked);
		
	}
	
	public JavaPractice_Constructor(String name,byte age ,float weight, double height,long phoneNumber,int number,short salary,char initial, boolean liked  ) {
		this.name = name;
		this.age = age;
		this.weight= weight;
		this.height = height;
		this.phoneNumber = phoneNumber;
		this.number = number;
		this.salary = salary;
		this.initial = initial;
		this.liked = liked;
		
	}
	

	public static void main(String[] args) {
		
		JavaPractice_Constructor con = new JavaPractice_Constructor();
		con.display();
		JavaPractice_Constructor con1 = new JavaPractice_Constructor("Subash",(byte)29,65.5f,165.561614916,8680835412L,1273128322,(short)10000,'k',true);
		con1.display();
		

	}

}
