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
		

		System.out.println("Hej " + name + "! V�lkommen hit!");
		System.out.println("Hej " + name + "! V�lkommen hit du ocks�!");
	}

	// skriv en metod som returnerar en h�lsning till en person
}



