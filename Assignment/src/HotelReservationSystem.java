import java.util.Scanner;

public class HotelReservationSystem {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);


		
		int choice = 1;
		
		while (choice != 0) {
			
			System.out.println("1. Create new Standart Room ");
			System.out.println("2. Display All Room information ");
			System.out.println("3. Display the total number of Rooms ");
			System.out.println("0. Exit ");
			
			choice = myScanner.nextInt();
			
			
			if (choice == 1) {
				if (StandartRoom.total == 5) {
					System.out.println(" Max number of Standart Rooms have been created." );
					continue;
				}
				StandartRoom Room = new StandartRoom();
				
				Room.createRoom();
			}
			
			else if ( choice == 2 ) {
				for (int i = 1; i <= StandartRoom.total;i++) {
					int personNum = StandartRoom.StandartRooms[i][1];
					int totalPrice = personNum * StandartRoom.StandartRooms[i][2];
					System.out.printf("Room #%d has %d people with a price total of $%d.\n", i , personNum , totalPrice);
				}
			}
			else if (choice == 3 ) {
				System.out.printf("%d Rooms have been created so far.\n", StandartRoom.total);
			}
			
		
						
		}
		
		
		
	}

}
