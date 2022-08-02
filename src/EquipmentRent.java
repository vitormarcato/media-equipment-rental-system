import java.util.Calendar;

public class EquipmentRent {
	
	String userName;
	Calendar rentDate;
	Calendar returnDate;
	String ClassId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Calendar getRentDate() {
		return rentDate;
	}

	public void setRentDate(Calendar rentDate) {
		this.rentDate = rentDate;
	}

	public Calendar getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Calendar returnDate) {
		this.returnDate = returnDate;
	}

	public String getClassId() {
		return ClassId;
	}

	public void setClassId(String classId) {
		ClassId = classId;
	}

}