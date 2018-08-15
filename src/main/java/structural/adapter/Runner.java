package structural.adapter;

import java.util.LinkedList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// Suppose this runner is a client has only have access to IEmployee Interface.
		// now we need some EmployeeLegacy and they do not implement IEmployee.
		// What to do now.
		List<IEmployee> employeeList = new LinkedList<IEmployee>();
		
		employeeList.add(new Employee(61, "Rahul", "Kapoor", "qwe@gmail.com"));
		
		//now hot to add EmployeeLegacy to this.
		// we cant do 
		//employeeList.add(new EmployeeLegacy("001", "Rahul", "Kapoor", "qwe@gmail.com"));
		
		//we will use adapters now.
		// Using composition Adapter method to change EmployeeLegacy to IEmployee.
		employeeList.add(new AdapterUsingComposition(new EmployeeLegacy("12", "Bhaskar", "Chaudhary", "asfa@hotmail.com")));
		
		// Using Inheritence Adapter method to change EmployeeLegacy to IEmployee.
		employeeList.add(new AdapterUsingInheritence("13", "Prem", "Chopra", "asdw@hotmail.com"));
		
		
		
		

	}

}
