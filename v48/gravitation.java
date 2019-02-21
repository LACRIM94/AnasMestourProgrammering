
public class gravitation {

	public static void main(String[] args) {

		double massaPerson = 80;
		double massaJorden = 5.972 * Math.pow(10, 24);
		double radieJorden = 6378000;
		double gravitationsKonstant = 6.67408 * Math.pow(10, -11);
		double gravitation;
		
		System.out.printf("The force is = %.2f N", gravitationkraft(massaJorden, massaPerson, radieJorden,
				 gravitationsKonstant));
		
		gravitation = gravitationKraft(massaJorden, massaPerson, radieJorden, gravitationsKonstant) / massaPerson;
		
		System.out.printf("\nJordens gravitationacce")
		
	}

	static double gravitationkraft(double massaJorden, double massaPerson, double radieJorden,
			double gravitationsKonstant) {
	
		double force;
		
		force = massaPerson * massaJorden * gravitationsKonstant/(Math.pow(radieJorden, 2));
		
		return force;
	}

}
