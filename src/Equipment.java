
public class Equipment {
	
	private static int equipmentId = -1;
	private String equipmentName;

	
	public Equipment(String equipmentName){
		Equipment.equipmentId++;
		this.setEquipmentName(equipmentName);
	}	
	
	public void registersuccessfull() {
		if (equipmentName != "") {
			System.out.println("\nEquipment register successfull");
			System.out.println("The " + equipmentName + " is ready!");
		}
	}	
	
	public int getEquipmentId() {
		return equipmentId;
	}
	
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	
}
	
