import java.util.Random;
import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {
		

	
		Random rand = new Random(); 

		int numretsomgissas = rand.nextInt(100);
		int f�rs�k = 0;
		Scanner input = new Scanner (System.in);
		int gissa;
		boolean vinst = false;
		
		while (vinst == false) {
		
			System.out.println("Gissa ett nummer mellan 1 och 100: ");
		    gissa = input.nextInt();
		    f�rs�k++;
		    
		    if (gissa == numretsomgissas) {
		        vinst = true;
		    }   
		    else if (guess < numretsomgissas) {
		    System.out.println("Din gissning �r f�r l�gt");
		 
		    }
		    
		}
	}

}
