
public class Triangle implements IArea {//classกับinterface สามารถสื่อสารกันได้ผ่าน implements กันได้  เเต่ interface กับ interface implementห กันไม่ได้
	private double base;
	private double height;
	
	public Triangle() {
		
	}
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}

	@Override
	public double area() {
		return 0.5*base*height;
	}
	
	
}
