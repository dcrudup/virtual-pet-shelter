import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> rescuedPets = new HashMap<>();

	public void add(VirtualPet rescue) {
		rescuedPets.put(rescue.getRescueName(), rescue);
	}

	public VirtualPet findRescue(String rescueName) {
		return rescuedPets.get(rescueName);
	}

	public Collection<VirtualPet> getAllRescuedPets() {
		return rescuedPets.values();
	}

	public void adopt(VirtualPet rescue) {
		rescuedPets.remove(rescue.getRescueName(), rescue);
	}

	public void feedAllOfThePets() {
		for (VirtualPet rescue : rescuedPets.values()) {
			rescue.feedRescues();
		}
	}

	public void shouldWaterAllOfThePets() {
		for (VirtualPet rescue : rescuedPets.values()) {
			rescue.waterRescues();
		}

	}

	public VirtualPet playWithPet(String response) {
		return rescuedPets.get(response).playWithRescues();

	}

	public void tick() {

	}

}