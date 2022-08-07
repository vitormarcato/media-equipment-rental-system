import java.util.Calendar;
import java.util.Scanner;

public class ReturnEquipment {
	Scanner sc = new Scanner(System.in);

	String userName;
	Calendar currentReturnDate = Calendar.getInstance();
	boolean damageStatus;

	public void returnEquipment() {

		int dayCurrent = currentReturnDate.get(Calendar.DAY_OF_MONTH);
		int monthCurrent = currentReturnDate.get(Calendar.MONTH);
		int yearCurrent = currentReturnDate.get(Calendar.YEAR);
		char control;
		char damageControl;
		String damageDescription = "";
		String returnEquipmentName = "";

		System.out.println("Do you want return a equipment? [y/n]");
		control = sc.nextLine().charAt(0);

		if (control == 'n' || control == 'N') {
			System.out.print("Please, try again.");
			System.exit(0);
		} else {

			while (control == 'y' | control == 'Y') {
				System.out.print("Type equipment name: ");
				returnEquipmentName = sc.nextLine();

				System.out.print("\nDo you want report any damage? [y/n]");
				damageControl = sc.nextLine().charAt(0);

				if (damageControl == 'y') {
					System.out.println("\nPlease, enter the damage description:");
					damageDescription = sc.nextLine();
					break;
				} else {
					System.out.print("\nDo you want return another equipment? [y/n]");
					control = sc.nextLine().charAt(0);
				}
			}
			System.out.printf("\nThe return date is [mm/dd/yyyy]: %02d/%02d/%d", (monthCurrent + 1), dayCurrent,
					yearCurrent);
			System.out.println("\nThank you!");
			
		}
	}
}
