package structural.composite;

import java.util.ArrayList;
import java.util.List;


// The composite class which
// implements the base interface and
// contains a Collection of Department Components
// and have methods to add and remove them
public class HeadDepartment implements Department{
	
	private Integer id;
    private String name;
 
    private List<Department> childDepartments;
 
    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }
 
    public void printDepartmentDetails() {
    	System.out.println(this.toString());
        childDepartments.forEach(Department::printDepartmentDetails);
        // As a composite we know about our children.
    }
 
    public void addDepartment(Department department) {
        childDepartments.add(department);
    }
 
    public void removeDepartment(Department department) {
        childDepartments.remove(department);
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

	public List<Department> getChildDepartments() {
		return childDepartments;
	}

	public void setChildDepartments(List<Department> childDepartments) {
		this.childDepartments = childDepartments;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeadDepartment [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
