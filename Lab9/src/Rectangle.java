
public class Rectangle extends Shape {
	public Rectangle() {
		//super();
	}//defalse
	public Rectangle(double w,double h) {//���ҧ��������ͺ�礢͡������١����ö��Argument
		super(w,h);//constructor �ҡ�������
	}
	@Override//���ʹ area ������͹�ͧ����������˹�ҷ���ҧ�ѹ
	public double area() {
		return super.getW() * super.getH();
	}

}
