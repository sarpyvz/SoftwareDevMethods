
public class Double extends Room{
	
	public Double() {
		setDailyCost(180);
		setRoomSize(30);
		setHasBath(false);
		
		
	}
	

	@Override
	public String toString() {
		return "Room Type: Double, Daily Cost: " + getDailyCost() + ", Room Size: " + getRoomSize() + ", Has Bath: " + hasBath;
	}
}
