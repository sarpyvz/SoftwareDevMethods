
public class FamilyWithView extends Room{
	
	public FamilyWithView() {
		
		setDailyCost(450);
		setRoomSize(50);
		setHasBath(true);
		
	}
	
	@Override
	public String toString() {
		return "Room Type: Family With View, Daily Cost: " + getDailyCost() + ", Room Size: " + getRoomSize() + ", Has Bath: " + hasBath;
	}
}
