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
	VirtualPet homelessPet1;
	VirtualPet homelessPet2;
	
	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		homelessPet1 = new VirtualPet("1", "Dog");
		homelessPet2 = new VirtualPet("2", "Cat");
		
	}
	
	@Test
	public void shouldBeAbleToIntakeHomelessPets() {
		underTest.add(homelessPet1);
		VirtualPet retrievedRescue = underTest.findRescue("1");
		assertThat(retrievedRescue, is(homelessPet1));
		
	}
	
	@Test
	public void shouldBeAbleToIntakeTwoHomelessPets() {
		underTest.add(homelessPet1);
		underTest.add(homelessPet2);
		Collection<VirtualPet> allHomelessPets = underTest.getallHomelessPets();
		assertThat(allHomelessPets, containsInAnyOrder(homelessPet1, homelessPet2));
		assertEquals(2, allHomelessPets.size());
	}
	
	@Test
	public void shouldBeAbleToAdoptAHomelessPet() {
		underTest.add(homelessPet1);
		underTest.adopt(homelessPet1);
		VirtualPet retrievedRescue = underTest.findRescue(homelessPet1.getVirtualPet());
		assertThat(retrievedRescue, is(nullValue()));
		
	}
	
	@Test
	public void homelessPetsShouldHaveADefaultHungerLevelOf25() {

		VirtualPet underTest = new VirtualPet(20, 0, 0);
		int check = underTest.getHungerLevel();
		assertEquals(20, check);

	}
	
	@Test
	public void homelessPetsShouldHaveADefaultThirstLevelOf25() {

		VirtualPet underTest = new VirtualPet(0, 25, 0);
		int check = underTest.getThirstLevel();
		assertEquals(25, check);

	}
}
