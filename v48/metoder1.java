import java.util.Scanner;

public class metoder1 {
	
	public static void main() {
		
		Scanner input = new Scanner(System.in);
		String name;
		String name2;
		
		System.out.println("Hej! Vad heter du?");
		name = input.nextLine();
		name2 = input.nextLine();
		
		welcomeMessage(name, name2);
		
	}
		
		
		static void welcomeMessage(String name,String name2) {
		

		System.out.println("Hej " + name + "! Välkommen hit!");
		System.out.println("Hej " + name + "! Välkommen hit du också!");
	}

	// skriv en metod som returnerar en hälsning till en person
}



