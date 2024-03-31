
public class Club extends Room{
	
	public Club() {
		setDailyCost(250);
		setRoomSize(45);
		setHasBath(true);
		
	}
	
	@Override
	public String toString() {
		return "Room Type: Club, Daily Cost: " + getDailyCost() + ", Room Size: " + getRoomSize() + ", Has Bath: " + hasBath;
	}
}
