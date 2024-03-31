import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Main {

	static Reservation[] Reservations = new Reservation[4];
	
	
	public enum MenuOptions{
		
		FIRST("1. Create new Reservation "),
		SECOND("2. Create new Reservation with Room Type "),
		THIRD("3. Display all Reservations "),
		FOURTH("4. Display the total number of  Reservations "),
		FIFTH("5. List the reservations for a spesific city"),
		SIXTH("6. Remove reservations in a specific city"),
		SEVENTH("7. Exit");

		private final String description;

	    MenuOptions(String description) {
	        this.description = description;
	    }

	    public String getDescription() {
	        return description;
	    }
		
	}
	
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		int choice = 1;
		
		while (choice != 7) {
			
			
			for (MenuOptions option : MenuOptions.values()) {
	            System.out.println(option.getDescription());
	        }

			
			choice = myScanner.nextInt();
			
			if (choice == 1) {
				Reservation reservation = new Reservation();
				Reservations[Reservation.totalNumOfReservations] = reservation;
				System.out.println("Reservation created! ");

			}
			
			else if (choice == 2) {
				for (Room room : Room.Rooms) {
					System.out.println(room);
				}
				Reservation reservation = new Reservation(choice);
				Reservations[Reservation.totalNumOfReservations] = reservation;
				System.out.println("Reservation created! ");
			}
				
			
				
				
			else if ( choice == 3 ) {
				int total = Reservation.totalNumOfReservations;
				for (int i = 1; i <= total; i++) {
					if (Reservations[i] == null) {
						break;
					}
					Reservations[i].displayInfo();
				}
			}
			
			else if (choice == 4) {
				System.out.printf("%d reservations created so far.\n", Reservation.totalNumOfReservations);
			}
			
			
			else if (choice == 5) {
				System.out.println("Type a city name for a reservation search: ");
				String nameCity = myScanner.next();
				List<Reservation> list = Arrays.asList(Reservations);
				Iterator<Reservation> iter = list.iterator(); 
				
				while(iter.hasNext()) {
					Reservation reservation = iter.next();
					String hotelName;
					if (reservation != null) {
						hotelName = reservation.getHotelName();
						if ( hotelName.contains(nameCity)) {
							System.out.printf("%s \n",hotelName);
							
						}
					}	
				}
			}
			
			
			else if (choice == 6) {
				System.out.println("Type a city name for a reservation search: ");
				String nameCity = myScanner.next();
				int newSize;
				//List<Reservation> list = Arrays.asList(Reservations);
				List<Reservation> list = new ArrayList<>(Arrays.asList(Reservations));
				
				Iterator<Reservation> iter = list.iterator(); 
				
				while(iter.hasNext()) {
					Reservation reservation = iter.next();
					String hotelName;
					if (reservation != null) {
						hotelName = reservation.getHotelName();
						if ( hotelName.contains(nameCity)) {
							iter.remove();
							//list.remove(reservation);
							Reservation.totalNumOfReservations--;
						}
					}	
				}
				
				Reservations = null;
				newSize = list.size();
				Reservations = list.toArray(new Reservation[4]);
				
				
				
			}
						
		}
		

	}

}
