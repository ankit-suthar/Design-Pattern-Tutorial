package structural.adapter;

// This is adapter using Inheritence or Class Adapter
// It will extends the class for which adapter is needed.
// and will implement the interface of which Adapter is needed
public class AdapterUsingInheritence extends EmployeeLegacy implements IEmployee{

	public AdapterUsingInheritence(String serialNumber, String name, String surname, String hotmailAddress) {
		super(serialNumber, name, surname, hotmailAddress);
	}

	// All extended methods of IEmployees are implemented as needed.
	@Override
	public int getId() {
		return Integer.parseInt(getSerialNumber());
	}

	@Override
	public String getFirstName() {
		return getName();
	}

	@Override
	public String getLastName() {
		return getSurname();
	}

	@Override
	public String getEMail() {
		return getHotmailAddress();
	}
	

}
