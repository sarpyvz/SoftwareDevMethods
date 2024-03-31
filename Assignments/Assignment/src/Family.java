
public class Family extends Room{
	
	
	public Family() {
		setDailyCost(400);
		setRoomSize(50);
		setHasBath(false);
		
	}
	
	@Override
	public String toString() {
		return "Room Type: Family, Daily Cost: " + getDailyCost() + ", Room Size: " + getRoomSize() + ", Has Bath: " + hasBath;
	}
}
