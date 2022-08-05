import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		WelcomeDisplay PrintFirstScreen = new WelcomeDisplay();
		PrintFirstScreen.welcomeDisplay();

		Scanner sc = new Scanner(System.in);
		int userInicialInput;
		userInicialInput = Integer.parseInt(sc.nextLine());
		
		if (userInicialInput == 1) {
			
		} else if (userInicialInput == 2) {
			
		} else if (userInicialInput == 3) {

		} else if (userInicialInput == 4) {
			
			RegisterNewEquipment optionfour = new RegisterNewEquipment();
			optionfour.registerNewEquipment();

		} else if (userInicialInput == 0) {
			System.exit(0);
		} else {
			System.out.println("Please, try again.");
		}
		sc.close();
	}
}
