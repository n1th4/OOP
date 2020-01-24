
public class Main {

	public static void main(String[] args) {
		MyWebPage a = new MyWebPage();
		MyWebPage b = new MyWebPage();
		
		a.visiting();
		a.visiting();
		a.svisiting();
		a.svisiting();
		b.visiting();
		b.visiting();
		b.visiting();
		b.svisiting();
		b.svisiting();
		b.svisiting();
		a.Info();
		System.out.println("a = "+a.getcount());
		System.out.println("a =" +a.Info());
		System.out.println("b = "+b.getcount());
		System.out.println("b = "+b.Info());
		System.out.println("sum a b = "+b.getscount());


	}

}
