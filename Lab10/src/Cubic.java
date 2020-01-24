
public class Cubic implements IArea,Ivolume{
	private double side;
	
	public Cubic() {
		
	}
	
	public Cubic(double side) {
		this.side=side;
	}
	
	@Override
	public double volume() {
		return Math.pow(this.side, 3);
	}
	
	@Override
	public double area() {
		return Math.pow(this.side, 2);
	}

}
