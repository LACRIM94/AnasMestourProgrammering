import java.util.Scanner;

public class Läxa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	double tal = 1;
	double sum = 0; 
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please type a number: "); 
	
	while (tal != 0) {
		
		tal = input.nextDouble();
		sum += tal;
	}
	
		System.out.println("The sum of all numbers is " + sum);
		System.out.printf("The sum of all numbers is %.1f", + sum);
	
		input.close();
	}
	
		}
	
	
 
	

