import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Invoice inv1 = new Invoice(LocalDate.of(2018,Month.FEBRUARY,14),2500);
		Invoice inv2 = new Invoice(LocalDate.of(2018, Month.FEBRUARY, 15),3500);
		inv1.Count();
		inv1.getInvoiceInformation();
		
		
		inv2.Count();
		inv2.getInvoiceInformation();	
				
				

	}

}
