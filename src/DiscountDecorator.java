
public class DiscountDecorator implements Rentals {

	protected Rentals off;
	
	public DiscountDecorator(Rentals off) {
		this.off = off;
	}
	
//	@Override
//	public double applyDiscount(double price) {
//		// TODO Auto-generated method stub
//		return off.applyDiscount(price);
//	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		off.displayInfo();
	}

	@Override
	public double getPrices() {
		// TODO Auto-generated method stub
		return off.getPrices();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return off.getName();
	}

	
}
