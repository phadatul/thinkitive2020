
public class Manager extends Employee {

	double managerallowance, foodallowance, otherallowance;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int empid, String ename, double basicSalary, double medical) {
		super(empid, ename, basicSalary, medical);
		managerallowance = 0.1 * basicSalary;
		foodallowance = 0.08 * basicSalary;
		otherallowance = 0.03 * basicSalary;
	}
	
	@Override
	public double calculateGrossSalary() {
		this.grossSalary=super.calculateGrossSalary()+this.managerallowance+this.foodallowance+this.otherallowance;
		return this.grossSalary;
	}

}
