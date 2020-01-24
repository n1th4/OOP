
public abstract class Shape {
	public abstract double area();//ต้องเอาเมธอด area ไป override ในคลาสลูก
	public String toString() {//ถ้ายังไม่ทำการOverrideในคลาสลูก  Main จะเรียกใช้คลาสนี้  ผลรัน : Shape
		return "Shape";
	}
	

}
