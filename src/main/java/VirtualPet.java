
public class VirtualPet {

	private String rescueName;

	public VirtualPet(String rescueName, int hunger, int thirst, int boredom, String string2) {
		this.rescueName = rescueName;
		
	}

	public String getRescueName() {
		
		return rescueName;
	}

	public int getHungerLevel() {
		
		return 25;
	}
	
	public int getThirstLevel() {
		
		return 25;
	}

	public int getBoredomLevel() {
		
		return 25;
	}
}