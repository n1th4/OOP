
public class AccountReceivable {
	private String accountId;//เลขบัญชีไม่สามารถเปลี่ยนได้  สร้างgetอย่างเดียว  get = จะคืนค่าให้ โดยไม่สามารถเปลี่ยนจากภายนอกได้
	private String accountName;//ชื่อบัญชีสามารถเปลี่ยนได้  สร้าง set เเละ get >>> set = รีเซ็ตค่าจากภายนอกได้
	private double amountBalance;
	private double maximumDebit;
	private double debit;
	private double credit;
	
	public AccountReceivable(){//constructor ทำงานหลังสร้าง new object ถ้าเราสร้างออบเจ็คมันจะวิ่งมาทำงานที่นี่
		//new AccountReceivable();
		this.accountId = "";
		this.accountName = null;
		this.amountBalance = 0.0;
		this.maximumDebit = Double.POSITIVE_INFINITY;
	}
	
	public AccountReceivable(String accountId,String accountName) {//ตัวที่ส่งมา เรียก Argument ตัวที่รับ เรียก parameter
		//new AccountReceivable("Receive100","KK_ABC")
		this.accountId = accountId;
		this.accountName = accountName;
		System.out.println("2 Argument");
		System.out.println("accountId : "+accountId);
		System.out.println("accountName : "+accountName);
	}
	
	public AccountReceivable(String accountId,String accountName,double amountBalance) {//ตัวที่ส่งมา เรียก Argument ตัวที่รับ เรียก parameter
		//new AccountReceivable("Receive100","KK_ABC",200)
		this.accountId = accountId;
		this.accountName = accountName;
		this.amountBalance = amountBalance;
		System.out.println("3 Argument");
		System.out.println("accountId : "+accountId);
		System.out.println("accountName : "+accountName);
		System.out.println("amountBalance : "+amountBalance);
	}
	
	
	public AccountReceivable(String accountId,String accountName,double amountBalance,double maximumDebit) {//ตัวที่ส่งมา เรียก Argument ตัวที่รับ เรียก parameter
		//new AccountReceivable("Receive100","KK_ABC",200,500)
		this.accountId = accountId;
		this.accountName = accountName;
		this.amountBalance = amountBalance;
		this.maximumDebit = maximumDebit;
		System.out.println("4 Argument");
		System.out.println("accountId : "+accountId);
		System.out.println("accountName : "+accountName);
		System.out.println("amountBalance : "+amountBalance);
		System.out.println("maximumDebit : "+maximumDebit);
	}
	
	public String getAccountID() {//ไม่สามารถเปลี่ยนค่าได้ จะคืนค่าไปแสดงในMain ให้แสดงผลโดยใชsystem.out.print
		return this.accountId;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	public void setamountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}
	
	public double getamountBalance() {
		return this.amountBalance;
	}
	public void setmaximumDebit(double maximumDebit) {
		this.maximumDebit = maximumDebit;
	}
	
	public double maximumDebit() {
		return this.maximumDebit;
	}
	
	public void debit(double getamountBalance,double setamountBalance) {
		debit = getamountBalance+setamountBalance;
	}
	public double getdebit() {
		return this.debit;
	}
	public void credit(double getamountBalance,double setamountBalance) {
		credit = getamountBalance-setamountBalance;
	}
	public double getcredit() {
		return this.credit;
	}
	
	
	
}
