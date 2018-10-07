import java.util.ArrayList;
import java.util.Iterator;

public class RentalBasket implements Rentals {
	public ArrayList <Rentals> basket = new ArrayList<Rentals>();
	
	public void addComponent(Rentals movie) {
		// TODO Auto-generated method stub
		this.basket.add(movie);
	}

	
	public void removeComponent(Rentals movie) {
		// TODO Auto-generated method stub
		this.basket.remove(movie);
	}

	@Override
	public void displayInfo() {
//		Iterator rentalIterator = basket.iterator();
//		double basketSum = 0;
//		while(rentalIterator.hasNext()) {
//			Rentals info = (Rentals)rentalIterator.next();
//			info.displayInfo();
//			basketSum = basketSum + ((Movies) info).getPrices();
//		}
		
		//for(Rentals e: basket){
		//	e.displayInfo();
		//	basketSum = basketSum + ((Movies) e).getPrices();
		//}
		System.out.println("Basket Total = $"+ getPrices());
	}


	@Override
	public double getPrices() {
		// TODO Auto-generated method stub
		double sum = 0;
		Iterator rentalIterator = basket.iterator();
		
		while(rentalIterator.hasNext()) {
			Rentals info = (Rentals)rentalIterator.next();
			sum = sum + ((Movies) info).getPrices();
		}
		return sum;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Basket Total";
		
	}
	
}
