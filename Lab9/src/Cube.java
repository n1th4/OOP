
public class Cube extends Shape {
	private double deep;
	public Cube() {//���ҧ	constructor �������ʹѡ error ���������ա�û�͹���
	}
	
	public Cube(double deep,double w,double h) {
		super(w,h);//constructor��ͧ�ӧҹ�繵���á ��ͧ�����麹�ش����
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
