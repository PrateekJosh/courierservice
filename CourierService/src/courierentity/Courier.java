package courierentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courier")
public class Courier {

	@Id
	@Column
	private int courierNo;

	@Column
	private String courierName;

	@Column
	private String courierPhoneNo;

	public int getCourierNo() {
		return courierNo;
	}

	public void setCourierNo(int courierNo) {
		this.courierNo = courierNo;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierPhoneNo() {
		return courierPhoneNo;
	}

	public void setCourierPhoneNo(String curierPhoneNo) {
		this.courierPhoneNo = curierPhoneNo;
	}

}
