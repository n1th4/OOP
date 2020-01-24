
public class Cube extends Shape {
	private double deep;
	public Cube() {//สร้าง	constructor เปล่าเพื่อดัก error เมื่อไม่มีการป้อนค่า
	}
	
	public Cube(double deep,double w,double h) {
		super(w,h);//constructorต้องทำงานเป็นตัวแรก ต้องเอาไว้บนสุดเสมอ
		this.deep=deep;
	}
	
	public double getDeep() {
		return deep;
	}

	public void setDeep(double deep) {
		this.deep = deep;
	}
	
	@Override 
	public double area() {
		return deep*super.getH()*super.getW();
	}
	

}
