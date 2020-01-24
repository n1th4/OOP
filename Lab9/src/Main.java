
public class Main {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.setH(5.5);
		rec1.setW(3.2);
		System.out.println(rec1.area());
		
		Rectangle rec2 = new Rectangle(2.5,1.5);
		System.out.println(rec2.area());
		
		Cube c1 = new Cube(5.5,5.5,5.5);
		System.out.println(c1.area());
		
		//polymorphism==> คำสั่งเหมือนกัน แสดงผลต่างกัน  type ที่สร้าง object ต้องเป็น type ของคลาสแม่
		Calculator cal = new Calculator();
		Shape poly = new Rectangle();
		poly.setW(5.5);
		poly.setH(3.2);
		System.out.println(cal.process(poly));
		//System.out.println(poly.area());
		
		poly = new Cube(5.1,5.1,5.1);
		//poly.setW(5.1);
		//poly.setH(4.1);
		System.out.println(cal.process(poly));
		//System.out.println(poly.area());
		
		Cube c = new Cube();
		c.setDeep(5.5);
		c.setH(5.5);
		c.setW(5.5);
		System.out.println(cal.process(c));
		
	}

}
