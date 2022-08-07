import java.util.Calendar;
import java.util.Scanner;

public class BookEquipment extends Equipment {
	Scanner sc = new Scanner(System.in);
	Calendar rentDate;
	Calendar returnDate;
	String userName;
	
	public BookEquipment(String equipmentName) {
		super(equipmentName);
	}

	public void equipmentBooked() {
		System.out.println("Please, type your name: ");
		userName = sc.nextLine();
		System.out.println("Please enter the date to get [mm/dd/yyyy ]");
		
	}
	
	
	
}