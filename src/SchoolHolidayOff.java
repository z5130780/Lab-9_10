
public class SchoolHolidayOff extends DiscountDecorator {

	public static final double schoolOff = 0.75;
	
	public SchoolHolidayOff(Rentals off) {
		super(off);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Title : "+ super.getName());
		System.out.println("Price : "+ getPrices());
	}

	@Override
	public double getPrices() {
		// TODO Auto-generated method stub
		return super.getPrices()*schoolOff;
	}
	

}
