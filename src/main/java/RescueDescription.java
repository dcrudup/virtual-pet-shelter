import java.util.HashMap;
import java.util.Map;

public class RescueDescription {

	public static void main(String[] args) {

		Map<String, String> rescues = new HashMap<String, String>();
		{

			rescues.put("Bella", "Pitbull");
			rescues.put("Lucky", "Beagle");
			rescues.put("Sasha", "German Shephard");
			rescues.put("Charlie", "Chocolate Lab");

			System.out.println("The dogs currently in the shelter are " + rescues + ".");

		}

	}

}
