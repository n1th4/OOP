
public class Main {

	public static void main(String[] args) {
		Shape sp;
		//sp = new  Shape();//คลาสนามธรรม(abstract)ไม่สามารถสร้าง object ได้
		sp=new Circle(3.5);
		System.out.println(sp.toString());//บรรทัดที่8และ12เขียนเหมือนกันแต่ให้ผลลัพธ์ต่างกัน เรียกว่า Polymorphism
		System.out.println(sp.area());//บรรทัดที่9และ13เขียนเหมือนกันแต่ให้ผลลัพธ์ต่างกัน เรียกว่า Polymorphism
		
		sp = new Rectangle(5,7);
		System.out.println(sp.toString());//บรรทัดที่ 8และ12เขียนเหมือนกันแต่ให้ผลลัพธ์ต่างกัน เรียกว่า Polymorphism
		System.out.println(sp.area());//บรรทัดที่9และ13เขียนเหมือนกันแต่ให้ผลลัพธ์ต่างกัน เรียกว่า Polymorphism
		//Polymorphism
		//1.ตัวแปรอ้างอิงต้องเป็นชื่อของแม่
		//2.ต้องมีการOverride
		
		Shape[] arrShape = new Shape[5];//ไม่ได้สร้าง Ojectแต่เป็นการสร้างตัวแปรอ้างอิงShapeทั้งหมด5ตัว
		arrShape[0] = new Circle(2.5);
		arrShape[1] = new Rectangle(2,3);
		double totalArea = 0;
		//แบบfor
		for(int i=0;i<arrShape.length;i++) {
			if(arrShape[i]!=null) {//เเก้ปัญหาindexเกิน
			totalArea = totalArea+arrShape[i].area();
			}
		}
		System.out.println(totalArea);
		
		//แบบ each
		for(Shape shape : arrShape) {
			if(shape != null) {//เเก้ปัญหาindexเกิน
				totalArea = totalArea+shape.area();
				}
		}
		System.out.println(totalArea);
		
		IArea area;
		area = new Triangle(2,6);
		area = new Cubic(3);
		
		System.out.println(area.area());
		
	}
	 
}
