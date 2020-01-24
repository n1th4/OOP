
public class Car {
	private Engine engine;
	private String carId;
	private String owner;
	
	public Car() {
		this.engine=null;
	}
	public Car(String id,String series,String description,String carId,String owner) {
		this.engine = new Engine(id,series,description);
		this.carId = carId;
		this.owner=owner;
	}
	
	public Engine getEngine() {
		return this.engine;
	}
	
	public String getEngineInfo() {
		String info = String.format("Engine ID: %s \nEngine Series: %s \nDesciption: %s",this.engine.getId(),this.engine.getSeries(),this.engine.getDescription());
		return info;
	}
}
