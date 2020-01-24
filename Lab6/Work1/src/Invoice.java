import java.time.LocalDate;

public class Invoice {
	private static int id = 0;
	private LocalDate date;
	private double amount;
	private double vat;
	
	public Invoice() {
		
	}
	
	public Invoice(LocalDate d,double amount) {
		this.date = d;
		this.amount=amount;
	}
	
	public void Count() {
		Invoice.id++;
	}
	
	public int getCount() {
		return id;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public double vat(){
		return this.amount*0.07;
	}

	public String Info() {
		String tmp = "Inv-";
		String msg = String.format("%s%04d",tmp,id);
		return msg;
	
	}
	
	public void getInvoiceInformation() {
		System.out.format("ID: %s Date :%s Amount: %.2f Vat: %.2f\n",Info(),date,amount,vat());
		
	}
}
