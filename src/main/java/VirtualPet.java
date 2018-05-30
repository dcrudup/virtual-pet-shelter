
public class VirtualPet {

	private String rescueName;
	private int hunger;
	private int thirst;
	private int boredom;
	private String rescueDesc;

	public VirtualPet(String rescueName, int hunger, int thirst, int boredom, String rescueDesc) {
		this.rescueName = rescueName;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.rescueDesc = rescueDesc;
	}

	public String getRescueName() {

		return rescueName;
	}

	public int getHungerLevel() {

		return hunger;
	}

	public int getThirstLevel() {

		return thirst;
	}

	public int getBoredomLevel() {

		return boredom;
	}

	public void feedRescues() {

		hunger = hunger - 5;
	}

	public void waterRescues() {

		thirst = thirst - 5;

	}

	public VirtualPet playWithRescues() {

		boredom = boredom - 5;
		return null;
	}

	public Object getRescueDesc() {

		return rescueDesc;
	}

	public void tick() {

		if (hunger >= 30) {
		} else {
			hunger = hunger + 5;
		}

		if (thirst >= 30) {
		} else {
			thirst = thirst + 5;
		}

		if (boredom >= 20) {
		} else {
			boredom = boredom + 5;
		}
	}

}