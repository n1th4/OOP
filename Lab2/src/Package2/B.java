package Package2;

public class B {
	private int var1;//private use in class A only
	protected String var2;// use in package
	double var3;
	
	public void display() {
		var1 = 5;
		System.out.println("Class B");
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
}

}
