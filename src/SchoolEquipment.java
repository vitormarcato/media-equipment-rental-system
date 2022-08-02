
public class SchoolEquipment {
	private String equipmentDescription;
	private static int equipmentId = 0;
	private String equipmentName;
	private boolean rentStatus = false;
	private boolean operationStatus = true;
	
	public SchoolEquipment(){
		SchoolEquipment.equipmentId++;
	}
	
	public boolean getRentStatus() {
		return rentStatus;
	}

	public void setRentStatus(boolean rentStatus) {
		this.rentStatus = rentStatus;
	}

	public boolean getOperationStatus() {
		return operationStatus;
	}

	public void setOperationStatus(boolean operationStatus) {
		this.operationStatus = operationStatus;
	}
	
	
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	
	public String getEquipmentDescription() {
		return equipmentDescription;
	}
	public void setEquipmentDescription(String equipmentDescription) {
		this.equipmentDescription = equipmentDescription;
	}
	
	public int getEquipmentId() {
		return equipmentId;
	}
}
	
