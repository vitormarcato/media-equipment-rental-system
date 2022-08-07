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
			optionOne.registerNewEquipment();
			optionOne.getListItensOfIventory();
			optionOne.displayInventory();
			
		} else if (userInicialInput == 2) {
			BookEquipment optionTwo = new BookEquipment();
			optionTwo.equipmentBooked();
			
		} else if (userInicialInput == 3) {
			ReturnEquipment optionThree = new ReturnEquipment();
			optionThree.returnEquipment();			

		} else if (userInicialInput == 4) {
			
			RegisterNewEquipment optionFour = new RegisterNewEquipment();
			optionFour.getListItensOfIventory();
			optionFour.displayInventory();			
			
		} else if (userInicialInput == 0) {
			System.exit(0);
		} else {
			System.out.println("Please, try again.");
		}
		sc.close();
	}
}
