
public class Engine {
	private String id;
	private String series;
	private String description;
	
	public Engine() {
		
	}
	public Engine(String id,String series,String description) {
		this.id=id;
		this.series=series;
		this.description=description;	
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getSeries() {
		return this.series;
	}
	public void setSeries(String series) {
		this.series=series;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description=description;
	}

}
