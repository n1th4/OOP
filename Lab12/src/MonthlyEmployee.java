
public class MonthlyEmployee extends Employee {
	private double mRate;
	private String position;
	
	public  MonthlyEmployee() {
		
	}
	public MonthlyEmployee(double mRate,String position) {
		this.mRate=mRate;
		this.position=position;	
	}
	public  MonthlyEmployee(String id,String name,String tel,double mRate,String position) {
		super (id,name,tel);
		this.mRate=mRate;
		this.position=position;
	}
	public double getmRate() {
		return mRate;
	}
	public void setmRate(double mRate) {
		this.mRate = mRate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public double earnReciving() {
		return mRate;
	}

}
