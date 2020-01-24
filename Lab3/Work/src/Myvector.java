
public class Myvector {
	private int[] vector1;
	private int[] vector2;
	private int[] results;
	
	public Myvector() {
		System.out.println("Myvector()");
	}
	public Myvector(int[] vector1,int[]vector2) {
		this.vector1 = vector1;
		this.vector2 = vector2;
		System.out.println("Calculator(vector1,vector2)");
	}
	
	public void sumVectors() {
		results = new int [vector1.length];
		for(int i=0;i<vector1.length;i++) {
			results[i] = vector1[i] +vector2[i] ;
		}
		
	}
	
	public void showResults() {
		for(int i=0;i<vector1.length;i++) {
			System.out.println("Result("+i+") ="+results[i]);
		}
	}
	
	public void setvector1(int[] vector1) {
		this.vector1 = vector1;
	}
	
	public int[] getvector1() {
		return this.vector1;
	}
	
	public void setvector2(int[] vector2) {
		this.vector2 = vector2;
	}
	
	public int[] getvector2() {
		return this.vector2;
	}

	public void setResults(int[] results) {
		this.results = results;
	}
	
	public int[] getResults() {
		return this.results;
	}
}
