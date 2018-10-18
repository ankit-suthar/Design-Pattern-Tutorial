package structural.composite;

public class Runner {

	public static void main(String[] args) {
		
		// Leafs added
		Department salesDepartment = new SalesDepartment(
				1, "Sales department");
		Department financialDepartment = new FinancialDepartment(
				2, "Financial department");

		
		HeadDepartment headDepartment = new HeadDepartment(
				3, "Head department");
		// Composite class which has leaf classes
		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);

		headDepartment.printDepartmentDetails();
		
		System.out.println("\n We can also use leafs directly example:");
		salesDepartment.printDepartmentDetails();

	}

}
