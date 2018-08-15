package structural.adapter;

// This is an example of Adapter using Composition or Object Adapter
// This class implements IEmployee which will help the client
// and contains EmployeeLegacy to be used.
public class AdapterUsingComposition implements IEmployee{
	
	// This conatins Legacy class which we need to use and implements the interface 
	// according to which we need implementation
	private EmployeeLegacy employeeLegacy;

	public AdapterUsingComposition(EmployeeLegacy employeeLegacy) {
		super();
		this.employeeLegacy = employeeLegacy;
	}

	// All methods of interface are overridden as per requirement.
	@Override
	public int getId() {
		return Integer.parseInt(employeeLegacy.getSerialNumber());
	}

	@Override
	public String getFirstName() {
		return employeeLegacy.getName();
	}

	@Override
	public String getLastName() {
		return employeeLegacy.getSurname();
	}

	@Override
	public String getEMail() {
		return employeeLegacy.getHotmailAddress();
	}

}
