
public class NewMovie extends Movies{

	public String type = "NEW";
	public int days = 1;
	
	public NewMovie(String name, int days){
		super(name, days);
		this.days = days;
		this.type = getType();
		this.prices = new NewTotalPrice();
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
