public class Jaeger{
	private String name;
	private String model;
	private int height;
	private int weight;
	private String weapons;
	private String pilots;
	private String status;

	public void setName(String name){
		this.name = name;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public void setweight(int weight){
		this.weight = weight;
	}
	public void setWeapons(String weapons){
		this.weapons = weapons;
	}
	public void setPilots(String pilots){
		this.pilots = pilots;
	}
	public void setStatus(String status){
		this.status = status;
		
	}
	public String getName(){
		return name;
	}
	public String getModel(){
		return model;
	}
	public int getHeight(){
		return height;
	}
	public int getweight(){
		return weight;
	}
	public String getWeapons(){
		return weapons;
	}
	public String getPilots(){
		return pilots;
	}
	public String getStatus(){
		return status;
	}


}