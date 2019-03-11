import java.util.Random;
import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {
		

	
		Random rand = new Random(); 

		int numretsomgissas = rand.nextInt(101);
		int försök = 0;
		Scanner input = new Scanner (System.in);
		int gissa;
		boolean vinst = false;
		
		while (vinst == false || försök == 5) {
		
			System.out.println("Gissa ett nummer mellan 1 och 100: ");
		    gissa = input.nextInt();
		    försök++;
		    
		    if (gissa == numretsomgissas) {
		        vinst = true;
		        System.out.println("Du vann");
				System.out.println("Numret var " + numretsomgissas);
				System.out.println("Det tog dig " + försök + " försök");
				    
		    }   
		    else if (gissa < numretsomgissas) {
		    System.out.println("Din gissning är för låg");
		 
		    }
		    else if (gissa > numretsomgissas) {
			    System.out.println("Din gissning är för hög");
			 
			    }
		    if (försök == 5) {
		    System.out.println("Du förlorade, max antalet försök är 5");
		    System.out.println("Numret var " + numretsomgissas);
		    break;
	        
		    
		}
		
		
} } }