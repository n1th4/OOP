
public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		this.radius=0.0;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		System.out.println(super.toString());//เรียกเมธอดของแม่
		return "Circle";
	}
	
	
}

