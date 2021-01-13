
public class MarketingExecutive extends Employee {
	double tourallowance, phoneallowance;
	int kms_travelled;

	public MarketingExecutive() {

	}

	public MarketingExecutive(int empid, String ename, double basicSalary, double medical, int kms_travelled) {
		super(empid, ename, basicSalary, medical);
		this.tourallowance = 5 * kms_travelled;
		this.phoneallowance = 1500;
	}
	
	@Override
	public double calculateGrossSalary() {
		this.grossSalary=super.calculateGrossSalary()+this.phoneallowance+this.tourallowance;
		return this.grossSalary;
	}

}
