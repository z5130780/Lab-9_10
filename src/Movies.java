
public class Movies implements Rentals {
	
	private String name;
	private String type;
	private int days;
	public PricingHandler prices;
	
	public Movies(String name, int days) {
		this.name = name;
		this.days = days;
	}
	public String getType() {
		return type;
	}

	public int getDays() {
		return days;
	}
	
	public double getPrices() {
		return prices.getTotalPrice(getDays());
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name : "+ getName());
		System.out.println("Price : "+ getPrices());
	}

	
	
}
