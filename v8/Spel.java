import java.util.Random;
import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {
		

	
		Random rand = new Random(); 

		int numretsomgissas = rand.nextInt(101);
		int f�rs�k = 0;
		Scanner input = new Scanner (System.in);
		int gissa;
		boolean vinst = false;
		
		while (vinst == false || f�rs�k == 5) {
		
			System.out.println("Gissa ett nummer mellan 1 och 100: ");
		    gissa = input.nextInt();
		    f�rs�k++;
		    
		    if (gissa == numretsomgissas) {
		        vinst = true;
		        System.out.println("Du vann");
				System.out.println("Numret var " + numretsomgissas);
				System.out.println("Det tog dig " + f�rs�k + " f�rs�k");
				    
		    }   
		    else if (gissa < numretsomgissas) {
		    System.out.println("Din gissning �r f�r l�g");
		 
		    }
		    else if (gissa > numretsomgissas) {
			    System.out.println("Din gissning �r f�r h�g");
			 
			    }
		    if (f�rs�k == 5) {
		    System.out.println("Du f�rlorade, max antalet f�rs�k �r 5");
		    System.out.println("Numret var " + numretsomgissas);
		    break;
	        
		    
		}
		
		
} } }