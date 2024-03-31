import java.util.Scanner;

public class Reservation {
	
	private String hotelName;
	private String reservationMonth;
	private int reservationStart;
	private int reservationEnd;
	
	private RoomType roomType;
	static int totalNumOfReservations = 0;
	static int reservationIndex = -1;
	
	public Room room;


	Scanner scanner = new Scanner(System.in);
	
	public enum RoomType{
		SINGLE("Single"),
		DOUBLE("Double"),
		CLUB("Club"),
		FAMILY("Family"),
		FAMILYWITHVIEW("Family With View"),
		SUITE("Suite");	
		
		private final String roomInfo;

	    RoomType(String roomInfo) {
	        this.roomInfo = roomInfo;
	    }

	    public String getDescription() {
	        return roomInfo;
	    }
	    

	}
	
	public Reservation() {
//		String strRoomType; 
		
		System.out.println("Hotel Name: ");
		hotelName = scanner.nextLine();
		
		System.out.println("Reservation Month: ");
		reservationMonth = scanner.nextLine();

		System.out.println("Reservation Start: ");
		reservationStart = scanner.nextInt();

		System.out.println("Reservation End: ");
		reservationEnd = scanner.nextInt();
		
		room = new Room();
		roomType = RoomType.SINGLE;
		
		
		
//		System.out.println("Daily Cost: ");
//		dailyCost = scanner.nextInt();
		
//		System.out.println("Room Type: ");
//		strRoomType = scanner.next();
//		roomType = RoomType.valueOf(strRoomType);
		totalNumOfReservations++;
		reservationIndex++;
	}
	
	

	public Reservation(int choice) {
		
		System.out.println("Hotel Name: ");
		hotelName = scanner.nextLine();
		
		if (choice == 2) {	
			System.out.println("Room Type: ");
			String inputRoom = scanner.nextLine();
			switch (inputRoom.toUpperCase()){
				case "SINGLE":
		            room = new Single();
		            roomType = RoomType.SINGLE;
		            break;
		        case "DOUBLE":
		            room = new Double();
		    		roomType = RoomType.DOUBLE;
		            break;
		        case "CLUB":
		            room = new Club();
		    		roomType = RoomType.CLUB;
		            break;
		        case "FAMILY":
		            room = new Family();
		    		roomType = RoomType.FAMILY;
		            break;
		        case "FAMILY_WITH_VIEW":
		            room = new FamilyWithView();
		    		roomType = RoomType.FAMILYWITHVIEW;

		            break;
		        case "SUITE":
		            room = new Suite();
		    		roomType = RoomType.SUITE;
		            break;
			}
		}
		
		System.out.println("Reservation Month: ");
		reservationMonth = scanner.next();

		System.out.println("Reservation Start: ");
		reservationStart = scanner.nextInt();

		System.out.println("Reservation End: ");
		reservationEnd = scanner.nextInt();
		
		
		totalNumOfReservations++;
	}

	public void displayInfo() {
		System.out.printf("Reservation  for a %s room in %s starts on %s %d and ends on %s %d. \n",roomType.getDescription() ,getHotelName(), getReservationMonth(), getReservationStart(),getReservationMonth(), getReservationEnd()  );
		System.out.printf("Reservation has a total cost of %d.	\n", calculateTotalPrice());
		
	}
	
	
	public int calculateTotalPrice() {
		if ( getReservationMonth().equals("June" ) | getReservationMonth().equals("July" ) | getReservationMonth().equals("August")) {
			return room.getDailyCost() * 2 * (reservationEnd - reservationStart) ;
		}
			
		return room.getDailyCost() * (reservationEnd - reservationStart);
	}
	
	
	
	

	public String getHotelName() {
		return hotelName;
	}

	public String getReservationMonth() {
		return reservationMonth;
	}

	public int getReservationStart() {
		return reservationStart;
	}

	public int getReservationEnd() {
		return reservationEnd;
	}

	



}


