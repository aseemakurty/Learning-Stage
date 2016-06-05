
public class Car implements Vehicle{

	private String brandname;
	private String vehicletype;
	private String color;
	private int regno;
	
	public Car(String brandname,String vehicletype,String color, int regno)
	{
		this.brandname = brandname;
		this.vehicletype = vehicletype;
		this.color=color;
		this.regno =regno;
	}
	
	public void details()
	{
		System.out.println("Details: "+vehicletype +"_"+color +"_"+brandname +" :"+regno);
		
	}
	
}
