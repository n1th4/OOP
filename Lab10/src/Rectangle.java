
public class Rectangle extends Shape {
	private double w;
	private double h;
	
	public Rectangle() {
		this.w=0.0;
		this.h=0.0;
	}
	public Rectangle(double w,double h) {
		this.h=h;
		this.w=w;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	@Override
	public double area() {
		return w*h;
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
	
	

}
