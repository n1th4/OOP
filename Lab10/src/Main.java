
public class Main {

	public static void main(String[] args) {
		Shape sp;
		//sp = new  Shape();//���ʹ������(abstract)�������ö���ҧ object ��
		sp=new Circle(3.5);
		System.out.println(sp.toString());//��÷Ѵ���8���12��¹����͹�ѹ�������Ѿ���ҧ�ѹ ���¡��� Polymorphism
		System.out.println(sp.area());//��÷Ѵ���9���13��¹����͹�ѹ�������Ѿ���ҧ�ѹ ���¡��� Polymorphism
		
		sp = new Rectangle(5,7);
		System.out.println(sp.toString());//��÷Ѵ��� 8���12��¹����͹�ѹ�������Ѿ���ҧ�ѹ ���¡��� Polymorphism
		System.out.println(sp.area());//��÷Ѵ���9���13��¹����͹�ѹ�������Ѿ���ҧ�ѹ ���¡��� Polymorphism
		//Polymorphism
		//1.�������ҧ�ԧ��ͧ�繪��ͧ͢���
		//2.��ͧ�ա��Override
		
		Shape[] arrShape = new Shape[5];//��������ҧ Oject���繡�����ҧ�������ҧ�ԧShape������5���
		arrShape[0] = new Circle(2.5);
		arrShape[1] = new Rectangle(2,3);
		double totalArea = 0;
		//Ẻfor
		for(int i=0;i<arrShape.length;i++) {
			if(arrShape[i]!=null) {//���ѭ��index�Թ
			totalArea = totalArea+arrShape[i].area();
			}
		}
		System.out.println(totalArea);
		
		//Ẻ each
		for(Shape shape : arrShape) {
			if(shape != null) {//���ѭ��index�Թ
				totalArea = totalArea+shape.area();
				}
		}
		System.out.println(totalArea);
		
		IArea area;
		area = new Triangle(2,6);
		area = new Cubic(3);
		
		System.out.println(area.area());
		
	}
	 
}
