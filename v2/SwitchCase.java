import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Gör en meny av olika maträtter

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Food mania! Please choose what you would like to eat!");
		System.out.println("(1) - American");
		System.out.println("(2) - French");
		System.out.println("(3) - Mexican");
		System.out.println("(4) - Italian");
		System.out.println("(5) - Quit");
		System.out.println();

		int choice = input.nextInt();

		String genre;
        
		
		switch (choice) {
		case 1:
			genre = "American";
			System.out.println("You chose " + genre + "! Here are three good dishes!");
			System.out.println();
			System.out.println("1. Hamburger with french fries");
			System.out.println("2. BBQ");
			System.out.println("3. Fried chicken");
			System.out.println();
			break;
		case 2:
			genre = "French";
			System.out.println("You chose " + genre + "! Here are three good dishes!");
			System.out.println();
			System.out.println("1. French tacos");
			System.out.println("2. Cordon Bleu");
			System.out.println("3. Crépe");
			System.out.println();
			break;
		case 3:
			genre = "Mexican";
			System.out.println("You chose " + genre + "! Here are three good dishes!");
			System.out.println();
			System.out.println("1. Tacos");
			System.out.println("2. Enchiladas");
			System.out.println("3. Guacamole");
			System.out.println();
			break;
		case 4:
			genre = "Italian";
			System.out.println("You chose " + genre + "! Here are three good dishes!");
			System.out.println();
			System.out.println("1. Pizza");
			System.out.println("2. Spaghetti bolognese");
			System.out.println("3. Lasagne");
			System.out.println();
			break;
		case 5:
			System.out.println("Thank you for today!");
			break;
		default:
			genre = "invalid";
			System.out.println("You have made a " + genre + " choice! Too bad for you!");
			System.out.println();
			break;
		}

		input.close();
	}

}