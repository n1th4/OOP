import java.util.*;
public class Test_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		    //instance variable ��� ����÷���С�ȹ͡���ʹ ����ö���¡����ء�����������й͡���� 
		int[] myarr;
		myarr = new int[5];
		myarr[0] = 0;
		myarr[1] = 1;
		myarr[2] = 2;
		myarr[3] = 3;
		myarr[4] = 4;
		
		int[] num = new int[myarr.length];
		for(int i=0;i<myarr.length;i++) {
			System.out.format("Input number [%d] :",i);	
			num[i] = kb.nextInt();
		}

		for(int i=0;i<myarr.length;i++) {
			System.out.format("myarr [%d] = %d\n",i,num[i]);
		}
		
		
		/*int num = 100;
		
		for(int i=0;i<myarr.length;i++) {
			myarr[i]=num;
			num = num-10;
			System.out.format("myarr [%d] = %d\n",i,myarr[i]);
		}*/
	}

}
