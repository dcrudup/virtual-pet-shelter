import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	VirtualPetShelter underTest;
	VirtualPet rescue1;
	VirtualPet rescue2;
	VirtualPet rescue3;
	VirtualPet rescue4;

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		rescue1 = new VirtualPet("Sadie", 25, 0, 0, "");
		rescue2 = new VirtualPet("Lucky", 25, 0, 0, "");
		rescue3 = new VirtualPet("Bella", 25, 0, 0, "");
		rescue4 = new VirtualPet("Charlie", 25, 0, 0, "");

	}

	@Test
	public void shouldBeAbleToIntakeRescuedPets() {
		underTest.add(rescue1);
		VirtualPet retrievedRescue = underTest.findRescue("Sadie");
		assertThat(retrievedRescue, is(rescue1));

	}

	@Test
	public void shouldBeAbleToIntakeTwoRescuedPets() {
		underTest.add(rescue1);
		underTest.add(rescue2);
		Collection<VirtualPet> allRescuedPets = underTest.getAllRescuedPets();
		assertThat(allRescuedPets, containsInAnyOrder(rescue1, rescue2));
		assertEquals(2, allRescuedPets.size());
	}
	
	
	@Test
	public void shouldBeAbleToAdoptARescuedPet() {
		underTest.add(rescue1);
		underTest.adopt(rescue1);
		VirtualPet retrievedRescue = underTest.findRescue(rescue1.getRescueName());
		assertThat(retrievedRescue, is(nullValue()));
	}
	
	
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

		VirtualPet underTest = new VirtualPet("", 0, 0, 0,"");
		int check = underTest.getBoredomLevel();
		assertEquals(25, check);

	}

	
}