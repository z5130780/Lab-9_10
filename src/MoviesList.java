import java.util.Iterator;

public class MoviesList {

	public static void main(String[] args) {

		RentalBasket newList = new RentalBasket();
		
		Movies Venom = new NewMovie("Venom", 5);
		Movies JohnnyEnglish = new NewMovie("Johnny English returns", 3);
		Movies WonderWoman = new RegularMovie("Wonder Woman", 2);
		Movies Logan = new RegularMovie("Logan", 1);
		Movies spaceOdessy = new ClassicMovie("2001: A Space Odessy", 1);
		
		
		newList.addComponent(Venom);
		newList.addComponent(JohnnyEnglish);
		newList.addComponent(WonderWoman);
		newList.addComponent(Logan);
		newList.addComponent(spaceOdessy);
		
		Iterator listIterator = newList.basket.iterator();
		
		
		if(newList.basket.size() > 4) {
			while(listIterator.hasNext() ) {
				Movies info = (Movies)listIterator.next();
				Rentals off = new TenPercentOff(info);
				off.displayInfo();
			}
			Rentals rb = new TenPercentOff(newList);
			System.out.println();
			rb.displayInfo();
		}
		
		else {
			while(listIterator.hasNext() ) {
				Movies info = (Movies)listIterator.next();
				info.displayInfo();
			}
			System.out.println();
			newList.displayInfo();
		}

	}

}
