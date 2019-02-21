
public class metoder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double KubikCentimeter = 1;
		
		System.out.println(cm3ToM3(KubikCentimeter) + " m^3");
	}

	static double cm3ToM3(double KubikCentimeter) {
		
		return (KubikCentimeter * Math.pow(10, -6));
	}
}
