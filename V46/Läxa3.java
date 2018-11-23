import java.util.Scanner;

public class Läxa3 {

	public static void main(String[] args) {
		// Skriv ett program som läser in en följd av tal och multiplicerar ihop dem. 
		//Inläsningen ska avbrytas då produktens belopp överstigit 
		//100 000 eller då 10 st tal skrivits in.

		{
	Scanner input = new Scanner (System.in);
	
	double tal = 1;
    double produkt = 1;
    double count = 0;
    
	 
	
	System.out.println("Skriv max 10 tal och upp till 100000");
	
    
    while (produkt <= 100000);
    
    tal = input.nextDouble();
    
    produkt = produkt * tal;
    
    count = count + 1;
    
    if (count == 10) {
    	break;
     } 
		} 
			} 
				}	

