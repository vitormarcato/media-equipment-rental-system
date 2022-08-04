import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("____________________________________________");
		System.out.println("# Welcome to Media Equipment Rental System #");
		System.out.println("____________________________________________");
		System.out.println("# Please, choose an option #");
		System.out.println("1 - show equipment list");
		System.out.println("2 - order equipment");
		System.out.println("3 - return equipment");
		System.out.println("4 - register new equipment");

		int userInicialInput = (Integer.parseInt(sc.nextLine()));

		if (userInicialInput == 4) {

			System.out.print("equipment name: ");
			Equipment RegisterNewEquipment = new Equipment();
			String inputEquipmentName = (sc.nextLine());
			RegisterNewEquipment.setEquipmentName(inputEquipmentName);

			System.out.print("equipment description: ");
			String inputEquipmentDescription = (sc.nextLine());
			RegisterNewEquipment.setEquipmentDescription(inputEquipmentDescription);
			
			if(inputEquipmentName != "") {
			System.out.println("Equipment register successfull");
			System.out.println("Name: " + inputEquipmentName);
			System.out.println("Description: " + inputEquipmentDescription);
			}else {
				System.out.println("Please, try again.");
			}
			
		}

	}
}
