import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

		VirtualPet rescue1 = new VirtualPet("Sadie", 25, 25, 25,
				": a Senior Golden Retriever. Moves slowly, but loves to cuddle.");
		VirtualPet rescue2 = new VirtualPet("Lucky", 25, 25, 25,
				": a Beagle puppy; full of energy. Needs lots of walks and playtime.");
		VirtualPet rescue3 = new VirtualPet("Bella", 25, 25, 25,
				": a beautiful blue/gray Pitbull. Abandoned due to breed specific laws.");
		VirtualPet rescue4 = new VirtualPet("Charlie", 25, 25, 25,
				": a Border Collie. Be careful, he's smarter than all of us!");

		myVirtualPetShelter.add(rescue1);
		myVirtualPetShelter.add(rescue2);
		myVirtualPetShelter.add(rescue3);
		myVirtualPetShelter.add(rescue4);

		Collection<VirtualPet> rescuedPets = myVirtualPetShelter.getAllRescuedPets();

		System.out.println("Welcome to iHeart Dogs Virtual Shelter!");
		System.out.println();
		System.out.println("These are the pets staying with us: ");
		System.out.println();
		for (VirtualPet current : myVirtualPetShelter.getAllRescuedPets()) {
			System.out.println(current.getRescueName() + " " + current.getRescueDesc());
		}

		System.out.println();
		System.out.println("This is their current status:");
		System.out.println();
		System.out.println("Name" + "\t" + "Hunger" + "\t" + "Thirst" + "\t" + "Boredom");
		String divider = "-------------------------------";
		System.out.println(divider);
		for (VirtualPet current : myVirtualPetShelter.getAllRescuedPets()) {
			System.out.println(current.getRescueName() + "\t" + " " + current.getHungerLevel() + "\t"
					+ current.getThirstLevel() + "\t" + current.getBoredomLevel());
		}

		String choice = "";

		do {

			myVirtualPetShelter.tick();

			System.out.println();
			System.out.println("What what would you like to do? Choose an option below:");
			System.out.println();
			System.out.println("Choose 1 to feed the rescues.");
			System.out.println("Choose 2 to fill the rescues water bowl.");
			System.out.println("Choose 3 to play with one our rescues.");
			System.out.println("Choose 4 to adopt one of the rescues.");
			System.out.println("Choose 5 to admit a new resuce.");
			System.out.println("Choose 6 to exit the menu.");
			choice = input.nextLine();
			System.out.println();

			if (choice.equals("1")) {
				for (VirtualPet current : myVirtualPetShelter.getAllRescuedPets()) {
					current.feedRescues();
					System.out.println("You've just fed " + current.getRescueName() + ". "
							+ "Their level of hunger is now at " + current.getHungerLevel() + ".");
				}

			} else if (choice.equals("2")) {

				for (VirtualPet current : myVirtualPetShelter.getAllRescuedPets()) {
					current.waterRescues();
					System.out.println("You've just filled " + current.getRescueName() + "'s water bowl. "
							+ "Their level of thirst is now at " + current.getThirstLevel() + ".");

				}

			} else if (choice.equals("3")) {

				System.out.println("You've chosen to play with one of our pups. Who do you want to play with?");
				String response = input.nextLine();

				VirtualPet rescuedPet = myVirtualPetShelter.playWithPet(response);

				System.out.println("Thank you for playing with " + response + " . A tired dog, is a good dog.");
				System.out.println();

			} else if (choice.equals("4")) {

				System.out.println("Great! You've chosen to adopt a pet!");
				System.out.println();
				System.out.println("Which pup would you like to adopt?");
				System.out.println();

				for (VirtualPet rescue : rescuedPets) {

					System.out.println("" + rescue.getRescueName() + " " + rescue.getRescueDesc());
				}

				System.out.println();
				String response2 = input.nextLine();
				VirtualPet rescuedPet = myVirtualPetShelter.findRescue(response2);
				System.out.println();
				System.out.println("Fantastic! " + response2 + " will be a great addition to your family.");
				System.out.println();

			} else if (choice.equals("5")) {

				System.out.println("Welcome to iHeart Dogs Intake Center.");
				System.out.println("When Animal Control brings in stray dog without tags,");
				System.out.println("we give the pups a name for recordkeeping purposes.");
				System.out.println();
				System.out.println("Choose a name for our new furry friend:");

				String newRescueName = input.nextLine();

				System.out.println("Welcome, " + newRescueName + "!");
				System.out.println();
				System.out.println("Describe our new pup: ");

				String newRescueDescription = input.next();
				VirtualPet newShelterPup = new VirtualPet(newRescueName, 25, 25, 25, newRescueDescription);
				myVirtualPetShelter.add(newShelterPup);

				System.out.println(newRescueName + ", hopefully your pet parents will come here to find you.");
				System.out.println("If not, we'll find another home for you.");

			} else if (choice.equals("6")) {
				System.out.println("Thank you for visiting iHeart Dogs Virtual Shelter. Goodbye!");

				System.exit(0);

			} else {

			}

		} while (!choice.equals("6"));

		input.close();

	}
}
