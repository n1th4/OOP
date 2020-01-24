
public class Main {

	public static void main(String[] args) {
		DailyEmployee d1 = new DailyEmployee("0001","Wass","083310789",27,250);
		
		MonthlyEmployee m1 = new MonthlyEmployee("0002","Ni","081564736",25000,"Programmer");
		
		Calculator cal = new Calculator();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		System.out.println(cal.getSalary(d1));
		System.out.println(cal.getSalary(m1));

	}

}
