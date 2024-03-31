
public class Suite extends Room{
	
	
	public Suite() {
		
		setDailyCost(650);
		setRoomSize(80);
		setHasBath(true);
		
	}
	
	@Override
	public String toString() {
		return "Room Type: Suite, Daily Cost: " + getDailyCost() + ", Room Size: " + getRoomSize() + ", Has Bath: " + hasBath;
	}
}
