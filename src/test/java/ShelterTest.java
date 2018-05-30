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
		rescue1 = new VirtualPet("Sadie", 25, 25, 25, "Senior Golden Retriever. Moves slowly, but loves to cuddle.");
		rescue2 = new VirtualPet("Lucky", 25, 25, 25,
				"Beagle puppy; full of energy. Needs lots of walks and playtime.");
		rescue3 = new VirtualPet("Bella", 25, 25, 25,
				"Beautiful blue/gray Pitbull. Abandoned due to breed specific laws.");
		rescue4 = new VirtualPet("Charlie", 25, 25, 25, "Border Collie. Be careful, he's smarter than all of us!");

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
	}

	@Test
	public void shouldBeAbleToAdoptARescuedPet() {
		underTest.add(rescue1);
		underTest.adopt(rescue1);
		VirtualPet retrievedRescue = underTest.findRescue(rescue1.getRescueName());
		assertThat(retrievedRescue, is(nullValue()));
	}

	@Test
	public void shouldFeedAllOfThePets() {
		underTest.add(rescue1);
		underTest.add(rescue2);
		underTest.feedAllOfThePets();
		int check = rescue1.getHungerLevel();
		assertEquals(20, check);
		int check2 = rescue2.getHungerLevel();
		assertEquals(20, check2);
	}

	@Test
	public void shouldWaterAllOfThePets() {
		underTest.add(rescue1);
		underTest.add(rescue2);
		underTest.shouldWaterAllOfThePets();
		int check = rescue1.getThirstLevel();
		assertEquals(25, check);
		int check2 = rescue2.getThirstLevel();
		assertEquals(25, check2);
	}

	@Test
	public void shouldPlayWithARescue() {
		underTest.add(rescue2);
		underTest.playWithPet("Lucky");
		int check = rescue2.getBoredomLevel();
		assertEquals(20, check);
	}

}