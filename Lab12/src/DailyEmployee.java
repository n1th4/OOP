
public class DailyEmployee extends Employee {
	private double day;
	private double rate;
	
	public DailyEmployee() {
		
	}
	public DailyEmployee(double day,double rate) {
		this.day=day;
		this.rate=rate;
	}
	public DailyEmployee(String id,String name,String tel,double day,double rate) {
		super (id,name,tel);
		this.day=day;
		this.rate=rate;
	}
	public double getDay() {
		return day;
	}
	public void setDay(double day) {
		this.day = day;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public double earnReciving() {
		return day*rate;
	}
	
	

}
