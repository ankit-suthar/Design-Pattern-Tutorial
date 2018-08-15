package structural.adapter;

public class EmployeeLegacy {
	
	private String serialNumber;
	
	private String name;
	
	private String surname;
	
	private String hotmailAddress;

	public EmployeeLegacy(String serialNumber, String name, String surname, String hotmailAddress) {
		super();
		this.serialNumber = serialNumber;
		this.name = name;
		this.surname = surname;
		this.hotmailAddress = hotmailAddress;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getHotmailAddress() {
		return hotmailAddress;
	}

	public void setHotmailAddress(String hotmailAddress) {
		this.hotmailAddress = hotmailAddress;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeLegacy [serialNumber=");
		builder.append(serialNumber);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", hotmailAddress=");
		builder.append(hotmailAddress);
		builder.append("]");
		return builder.toString();
	}
	
}
