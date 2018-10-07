
public class RegularTotalPrice implements PricingHandler {

	private int rentDays = 3;
	private double price = 3.00;
	private double overDuePrice = 1.00;
	
	@Override
	public double getTotalPrice(int days) {
		// TODO Auto-generated method stub
		double sum = 0;
		if (days > rentDays) {
			sum = price;
		}
		else {
			sum = price;
			return sum;
		}
		
		int afterRentDays = days - rentDays;
		if(afterRentDays > 0) {
			sum = sum + afterRentDays * overDuePrice;
		}
		return sum;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public double getOverDuePrice() {
		// TODO Auto-generated method stub
		return this.overDuePrice;
	}

}
