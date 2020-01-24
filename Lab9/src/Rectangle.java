
public class Rectangle extends Shape {
	public Rectangle() {
		//super();
	}//defalse
	public Rectangle(double w,double h) {//สร้างเพื่อให้ออบเจ็คขอกงคลาสลูกสามารถส่งArgument
		super(w,h);//constructor จากคลาสแม่
	}
	@Override//เมธอด area จะเหมือนของคลาสแม่แต่ทำหน้าที่ต่างกัน
	public double area() {
		return super.getW() * super.getH();
	}

}
