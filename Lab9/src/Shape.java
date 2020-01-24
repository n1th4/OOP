
public class Shape {
	private double w;
	private double h;
	
	public Shape() {	
		
	}
	public Shape(double w,double h) {
		this.w=w;
		this.h=h;
	}
	public void setW(double w) {
		this.w=w;
	}
	public double getW() {
		return w;
	}
	public void setH(double h) {
		this.h=h;
	}
	public double getH() {
		return h;
	}
	public double area() {//ยังไม่รู้รูปทรง จะไปแยกที่คลาสสลูก
		return 0;
	}
	
}
