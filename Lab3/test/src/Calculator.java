
public class Calculator {
	private int val;
	private double result;
	
	public Calculator() {
		System.out.println("Calculator()");
	}
	public Calculator(int val) {
		this.val = val;//this �к�����繵���âͧ����
		System.out.println("Calculator(int x)");
	}
	
	public void setval(int val) {
		this.val = val;//Setter
	}
	
	public int getval() {
		return this.val;//getter
	}
	
	public void setResult(double result) {
		this.result=result;
	}
	
	public double getResult(double result) {
		return this.result;
	}
	
	public void show() {
		System.out.println(this.val);
	}
	
	public void add(int x,int y) {//overload ���Ϳѧ��ѹ����͹�ѹ���Ѻ�����������ҧ�ѹ
		System.out.println(x + y);
	} 
	
	public void add(double x,double y) {
		System.out.println(x + y);
	}
	
	public double sub(double x,double y) {
		return x-y;
	}
	
	
}
