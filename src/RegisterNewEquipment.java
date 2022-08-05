import java.util.ArrayList;
import java.util.Scanner;

public class RegisterNewEquipment {
	
	public void registerNewEquipment() {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Equipment> list = new ArrayList<Equipment>();

		char control = 'y';

		do {
			System.out.print("Type equipment name: ");
			String inputEquipmentName = sc.nextLine();
			Equipment RegisterEquipment = new Equipment(inputEquipmentName);
			list.add(RegisterEquipment);
			RegisterEquipment.registersuccessfull();		
			System.out.print("\nDo you want to add new equipment? [y/n]");
			control = sc.nextLine().charAt(0);
		} while (control == 'y' | control == 'Y');

		for (Equipment i: list) {
			System.out.println(i.getEquipmentName());
		}
	sc.close();
	}
}
