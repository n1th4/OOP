
public class Main {

	public static void main(String[] args) {
		Car mycar = new Car("en001","a123","-","car001","33");
		System.out.println(mycar);
		System.out.println(mycar.getEngineInfo());
		System.out.println("---------------------------------------------");
		
		mycar = new Car("en002","a056","-","car002","kk");
		System.out.println(mycar);
		System.out.println(mycar.getEngine().getId());
		System.out.println(mycar.getEngine().getId());
		System.out.println(mycar.getEngine().getSeries());
		System.out.println(mycar.getEngine().getDescription());
		System.out.println("---------------------------------------------");
		System.out.println(mycar.getEngineInfo());

	}

}
