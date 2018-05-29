import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	Map<String, VirtualPet> homelessPets = new HashMap<>();

	public void add(VirtualPet homelessPet) {
		homelessPets.put(homelessPet.getVirtualPet(), homelessPet);
		
		
	}

	public VirtualPet findRescue(String VirtualPet) {
		
		return homelessPets.get(VirtualPet);
	}

	public Collection<VirtualPet> getallHomelessPets() {
		
		return homelessPets.values();
	}

	public void adopt(VirtualPet homelessPet) {
		homelessPets.remove(homelessPet.getVirtualPet(), homelessPet);
		
	}
	
}
