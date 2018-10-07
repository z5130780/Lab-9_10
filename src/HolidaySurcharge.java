
public class HolidaySurcharge extends DiscountDecorator {
	
	public static final double sur = 1.10;
	
	public HolidaySurcharge(Rentals off) {
		super(off);
	}

	@Override
	public void displayInfo() {
		System.out.println("Title : "+ super.getName());
		System.out.println("Price : "+ getPrices());
	}

	@Override
	public double getPrices() {
		return super.getPrices()*sur;
	}
	
}
