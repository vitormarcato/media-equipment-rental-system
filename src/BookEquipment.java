import java.util.Calendar;
import java.util.Scanner;

public class BookEquipment{
	Scanner sc = new Scanner(System.in);
	Calendar rentDate = Calendar.getInstance();
	Calendar returnDate = Calendar.getInstance();
	String userName;
	String rentEquipmentName;
	
	public void equipmentBooked() {

		int dayRent = rentDate.get(Calendar.DAY_OF_MONTH);
		int monthRent = rentDate.get(Calendar.MONTH);
		int yearRent = rentDate.get(Calendar.YEAR);

		int dayReturn = (dayRent+7);
		int monthReturn = returnDate.get(Calendar.MONTH);
		int yearReturn = returnDate.get(Calendar.YEAR);

		
		System.out.println("Please, type your name: ");
		userName = sc.nextLine();
		do {
		System.out.println("Type the name of equipment you want: ");
		rentEquipmentName = sc.nextLine();
		} while(rentEquipmentName == "");
		
		if(rentEquipmentName != "") {
		System.out.println("Equipment rent successfull");
		System.out.printf("\nYour rent date is [mm/dd/yyyy]: %02d/%02d/%d", (monthRent + 1), dayRent, yearRent);
		System.out.printf("\nThe return date is [mm/dd/yyyy]: %02d/%02d/%d", (monthReturn + 1), dayReturn, yearReturn);
		} else {
			System.out.println("Please, try again");
		}
		
	}

}