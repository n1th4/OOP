package Package;

public class A {
	private int var1;//private use in class A only
	protected String var2;// use in package
	double var3;
	
	void display() {
		var1 = 5;
		System.out.println("Class A");
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}
}
