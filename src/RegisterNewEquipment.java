import java.util.ArrayList;
import java.util.Scanner;

public class RegisterNewEquipment {
	
	ArrayList<Equipment> list = new ArrayList<Equipment>();
	
	public void getListItensOfIventory() {
		Equipment EquipmentOfSchool = new Equipment("WebCam");
		Equipment EquipmentOfSchool2 = new Equipment("GoPro Cam");
		Equipment EquipmentOfSchool3 = new Equipment("Voice Recorder");
		Equipment EquipmentOfSchool4 = new Equipment("Camera");

		list.add(EquipmentOfSchool);
		list.add(EquipmentOfSchool2);
		list.add(EquipmentOfSchool3);
		list.add(EquipmentOfSchool4);
	}
	
	public void registerNewEquipment() {
		Scanner sc = new Scanner(System.in);
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
		sc.close();
	}

	public void displayInventory() {
		System.out.print("\nEquipment List:\n");
		for (Equipment i : list) {
			System.out.println(i.getEquipmentName());
		}
	}
}
