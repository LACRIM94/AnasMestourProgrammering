import java.util.Scanner;

public class Läxa6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Bas: ");
		int bas = input.nextInt();

		for (int i = 0; i < bas; i++) {
			for (int j = 1; j < bas - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("X ");
			}
			System.out.println();
		}
	}
}
	