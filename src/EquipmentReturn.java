import java.util.Calendar;

public class EquipmentReturn {
	String userName;
	Calendar checkInDate;
	String classId;
	boolean damageStatus;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Calendar getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Calendar checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public boolean isDamageStatus() {
		return damageStatus;
	}
	public void setDamageStatus(boolean damageStatus) {
		this.damageStatus = damageStatus;
	}
}
