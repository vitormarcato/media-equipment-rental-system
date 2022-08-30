import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInicialInput;
		
		WelcomeDisplay PrintFirstScreen = new WelcomeDisplay();
		PrintFirstScreen.welcomeDisplay();
		userInicialInput = Integer.parseInt(sc.nextLine());
		
		switch (userInicialInput) {	
		case 1: RegisterNewEquipment optionOne = new RegisterNewEquipment();
		optionOne.registerNewEquipment();
		optionOne.getListItensOfIventory();
		optionOne.displayInventory();
		break;
		case 2: BookEquipment optionTwo = new BookEquipment();
		optionTwo.equipmentBooked();
		break;
		case 3:	ReturnEquipment optionThree = new ReturnEquipment();
		optionThree.returnEquipment();			
		break;
		case 4:	RegisterNewEquipment optionFour = new RegisterNewEquipment();
		optionFour.getListItensOfIventory();
		optionFour.displayInventory();		
		break;
		case 0: System.exit(0);
		default: System.out.println("Please, try again.");
		}
			
		sc.close();
	}
}
