package structural.composite;

// A leaf Component
public class SalesDepartment implements Department{

	private Integer id;

	private String name;

	public SalesDepartment(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public void printDepartmentDetails() {
		System.out.println(this.toString());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalesDepartment [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
