
public class MainMyvector {

	public static void main(String[] args) {
		int [] vect1= {1,2,3};
		int [] vect2= {4,5,6};
		Myvector vt = new Myvector();
		vt.setvector1(vect1);
		vt.setvector2(vect2);
		vt.sumVectors();
		vt.showResults();
		
	}

}
