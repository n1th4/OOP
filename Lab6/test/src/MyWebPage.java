
public class MyWebPage {
	private String text;//instant variable
	private int count = 0;//a �Ѻ b �йѺ�¡�ѹ
	private static int scount = 0;// class variable static �������ѹ a �Ѻ b � main �йѺ����ѹ
	
	public void visiting() {
		this.count++;
	}
	public void svisiting() {
		MyWebPage.scount++;
	}
	
	public int getcount() {
		return count;
	}
	
	public int getscount() {
		return scount;
	}
	
	public String gettext() {
		return this.text;
	}
	
	public void setcount(String text) {
		this.text=text;
	}

	public String Info() {
		//Local variable ��¹㹿ѧ��ѹ��ҹ��
		//      |
		//      V
		String tmp =  "The number of visitors of this page is ";
		String msg = String.format("%s %d",tmp, count);
		return msg;
	}
	
	
}
