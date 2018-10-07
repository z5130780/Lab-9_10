
public class RegularMovie extends Movies{

	public String type = "REGULAR";
	public int days = 3;
	
	public RegularMovie(String name, int days){
		super(name, days);
		this.days = days;
		this.type = getType();
		this.prices = new RegularTotalPrice();
	}
	
	public String getType() {
		return type;
	}

	public int getDays() {
		return days;
	}
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Title : "+ getName());
		System.out.println("Price : $"+ getPrices());
	}

}
