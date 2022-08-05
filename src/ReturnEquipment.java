import java.util.Calendar;
import java.util.Date;

public class ReturnEquipment {
	String userName;
	Calendar returnDate;
	String classId;
	boolean damageStatus;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Calendar getReturnDate() {
		return returnDate;
	}

	public Calendar setReturDate() {
		Calendar c = Calendar.getInstance();
		return this.returnDate = c.getTime();
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
