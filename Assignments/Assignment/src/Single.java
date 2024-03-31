
public class Single extends Room {
	
	public Single() {
		setDailyCost(100);
		setRoomSize(15);
		setHasBath(false);
		
	}
	
	@Override
	public String toString() {
		return "Room Type: Single, Daily Cost: " + getDailyCost() + ", Room Size: " + getRoomSize() + ", Has Bath: " + hasBath;
	}

	
}
