import java.util.*;
public class Test_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[][] m;//[]1 = ·∂« []2 = §Õ≈—¡πÏ
		m = new int[5][2];
		
		//System.out.println(m.length);
		//System.out.println(m[0].length);//®”π«π§Õ≈—¡πÏ¢Õß·∂«∑’Ë0
		//System.out.println(m[4].length);//®”π«π§Õ≈—¡πÏ¢Õß·∂«∑’Ë4
		int k =0;
		int[][] num = new int[m.length][m[0].length];
		int i,j;
		
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[0].length;j++) {
			num[i][j] = k;
			k=k+10;
			System.out.format(" %d ",k);
			}	
			System.out.println();
		}	
	}

}
