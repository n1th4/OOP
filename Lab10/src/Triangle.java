
public class Triangle implements IArea {//class�Ѻinterface ����ö������áѹ���ҹ implements �ѹ��  ��� interface �Ѻ interface implement� �ѹ�����
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
