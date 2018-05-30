import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void homelessPetsShouldHaveADefaultHungerLevelOf25() {

		VirtualPet underTest = new VirtualPet("", 25, 0, 0, "");
		int check = underTest.getHungerLevel();
		assertEquals(25, check);
	}

	@Test
	public void homelessPetsShouldHaveADefaultThirstLevelOf25() {

		VirtualPet underTest = new VirtualPet("", 0, 0, 0, "");
		int check = underTest.getThirstLevel();
		assertEquals(25, check);
	}

	@Test
	public void homelessPetsShouldHaveADefaultBoredomLevelOf25() {

		VirtualPet underTest = new VirtualPet("", 0, 0, 0, "");
		int check = underTest.getBoredomLevel();
		assertEquals(0, check);

	}

}
