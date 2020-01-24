
public class Main {

	public static void main(String[] args) {
		AccountReceivable ac = new AccountReceivable("603020315-9","KK_ABC");
		ac.setAccountName("Wass");
		ac.setamountBalance(200000);
		ac.setmaximumDebit(500000);
		ac.debit(200000, 50000);
		ac.credit(200000,50000 );
		
		System.out.println(
				"\nAccount Id : "+ac.getAccountID()+
				"\nAccount Name : "+ac.getAccountName()+
				"\nAmount Balance : "+ac.getamountBalance()+
				"\nMaximum Debit : "+ac.maximumDebit()+
				"\nDebit : "+ac.getdebit()+
				"\nCredit : "+ac.getcredit()
				);
		
		
		
	}

}
