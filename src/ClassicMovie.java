
public class ClassicMovie extends Movies{

	public String type = "CLASSIC";
	public int days = 5;
	
	public ClassicMovie(String name, int days){
		super(name, days);
		this.days = days;
		this.type = getType();
		this.prices = new ClassicTotalPrice();
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
