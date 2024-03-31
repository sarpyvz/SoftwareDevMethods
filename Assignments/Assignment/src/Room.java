	
public class Room {
	private int dailyCost;
	private int roomSize;
	public boolean hasBath;

	public static Room[] Rooms = {
		new Single(),
        new Double(),
	    new Club(),
	    new Family(),
	    new FamilyWithView(),
	    new Suite()
	 };
	 
	public Room() {
		
		setDailyCost(100);
		setRoomSize(15);
		setHasBath(false);
			
	}
	
	
	public String toString() {
		return "Room Type:"+ Room.class.getSimpleName() + "Daily Cost: " + dailyCost + ", Room Size: " + roomSize + ", Has Bath: " + hasBath;
	}
	

	public int getDailyCost() {
		return dailyCost;
	}
	public void setDailyCost(int dailyCost) {
		this.dailyCost = dailyCost;
	}
	public int getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;	
	}

	public void setHasBath(boolean hasBath) {
		this.hasBath = hasBath;
	}
	
	
}
