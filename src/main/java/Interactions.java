
public class Interactions {

	private int hunger;
	private int thirst;
	private int play;

	public Interactions(int hunger, int thirst, int outside) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.play = play;
	}

	// Instance Variable 1

	public int getHungerLevel() {

		return hunger;
	}

	// Method 1

	public void feedRescues() {
		hunger = hunger - 5;
	}

	// Tick Method
	public void tick() {

		if (hunger >= 30) {
		} else {
			hunger = hunger + 20;
		}

		if (thirst >= 30) {
		} else {
			thirst = thirst + 30;
		}
		if (play >= 20) {
		} else {
			play = play + 30;
		}
	}

	// Instance Variable 2

	public int getThirstLevel() {

		return thirst;
	}

	// Method 2

	public void waterRescues() {
		thirst = thirst - 10;

	}

	// Instance Variable 3

	public int getBoredomLevels() {

		return play;
	}

	// Method 3

	public void goPlay() {

		play = play - 5;

	}

}