import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInicialInput;
		
		WelcomeDisplay PrintFirstScreen = new WelcomeDisplay();
		PrintFirstScreen.welcomeDisplay();
		userInicialInput = Integer.parseInt(sc.nextLine());
		
		if (userInicialInput == 1) {
			RegisterNewEquipment optionOne = new RegisterNewEquipment();
			optionOne.getListItensOfIventory();
			optionOne.displayInventory();
			
		} else if (userInicialInput == 2) {
			
			
		} else if (userInicialInput == 3) {

		} else if (userInicialInput == 4) {
			
			RegisterNewEquipment optionFour = new RegisterNewEquipment();
			optionFour.registerNewEquipment();			
			
		} else if (userInicialInput == 0) {
			System.exit(0);
		} else {
			System.out.println("Please, try again.");
		}
		sc.close();
	}
}
