import java.util.Scanner;

public class StandartRoom {

	Scanner myScanner = new Scanner(System.in);
	
	static int total = 0;
	static int[][] StandartRooms = new int[6][3];
	
	//static StandartRoom stdRooms = new StandartRoom[5];

	int id;
	int personCount;
	int price;
	
	public StandartRoom() {
		total++;
		id = total;
		personCount = 0;
		price = 0;
		StandartRooms[id][0] = id;
	}
	
	public void createRoom() {
		System.out.println("Person Count: ");
		personCount = myScanner.nextInt();
		StandartRooms[id][1] = personCount;
		
		System.out.println("Price: ");
		price = myScanner.nextInt();
		StandartRooms[id][2] = price;
		
		System.out.printf("Room #%d is created !\n", id);
		
	}
	
	public int calculatePrice() {
		return personCount * price;		
	}
	
	public  void displayInfo() {
		System.out.printf("Room #%d  has %d people with a price total of %d.\n", id, personCount, calculatePrice() );
	}

	
}
