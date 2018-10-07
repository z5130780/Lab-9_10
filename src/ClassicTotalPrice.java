
public class ClassicTotalPrice implements PricingHandler {

	private int rentDays = 5;
	private double price = 2.50;
	private double overDuePrice = 0.50;
	
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
