
public class Room {
	private String no;
	private Person owner;
	public Room() {
		no = "Nonumber";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no= no;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
}
