package Package;

import Package2.B;
import Package2.Student;
public class main {

	public static void main(String[] args) {
		A a = new A();
		a.var2 = "Object";
		a.var3 = 3.5;
		a.display();
		
		B b = new B();
		b.display();
		
		Student std1 = new Student();
		std1.id = "603020315-9";
		std1.name = "Wassana";
		std1.email = "nor-ei=ni@hotmail.com";

	}

}
