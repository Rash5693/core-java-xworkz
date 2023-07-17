class Person{
	String name;
	String college;
	int age;
	long phno;

	Person(String n, String c, int a, long ph){
		name=n;
		college=c;
		age=a;
		phno=ph;
	}
	public static void printDetails(Person obj){
		System.out.println("Name: "+obj.name);
		System.out.println("College: "+obj.college);
		System.out.println("Age: "+obj.age);
		System.out.println("Phone Number: "+obj.phno);
		System.out.println("");

	}
}