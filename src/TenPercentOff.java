
public class TenPercentOff extends DiscountDecorator{

	public static final double tenOff = 0.90;
	
	public TenPercentOff(Rentals off) {
		super(off);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Title : "+ super.getName());
		System.out.println("Price : "+ getPrices());
	}

	@Override
	public double getPrices() {
		// TODO Auto-generated method stub
		return super.getPrices()*tenOff;
	}
	
}
