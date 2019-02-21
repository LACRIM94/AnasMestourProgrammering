
public class metoder2 {

	public static void main(String[] args) {
		
		double tempKelvin = 273.15;
		
		System.out.println(kelvinTocelsius(tempKelvin) + " °C");

	}
	

	static double kelvinTocelsius(double tempKelvin) {

		return (tempKelvin - 273.15);

}
}
