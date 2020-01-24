
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Plan");
		Room r = new Room();
		r.setNo("27");
		r.setOwner(p1);
		Room r2 = new Room();
		r2.setNo("307");
		r2.setOwner(new Person("Mean"));
		System.out.println(r.getNo()+"\tOwner: "+r.getOwner().getName());
		System.out.println(r2.getNo()+"\tOwner: "+r2.getOwner().getName());

	}

}
