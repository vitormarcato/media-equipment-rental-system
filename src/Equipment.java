
public class Equipment {
	
	private String equipmentDescription;
	private static int equipmentId = 0;
	private String equipmentName;
	private boolean rentStatus = false; //true = not available | false = available
	private boolean operationStatus = true; //true = working well  false = not working
	
	
	public Equipment(){
		Equipment.equipmentId++;
	}	
	public int getEquipmentId() {
		return equipmentId;
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
	
}
	
