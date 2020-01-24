
public class Main {

	public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.show();
	cal.add(6, 2);
	cal.add(10.5, 20.3);
	
	double result = cal.sub(1.1,0.9);
	System.out.println(result);

	Calculator c = new Calculator(50);
	c.show();
	c.setval(5);
	c.setResult(12.3);
	System.out.println(c.getval()+" : "+c.getResult(result));
	}

}
