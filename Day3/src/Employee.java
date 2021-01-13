
public class Employee {
	int empid;
	String ename;
	double basicSalary, PF, PT, HRA, medical, grossSalary, netSalary;

	public Employee() {
		

	}

	public Employee(int empid, String ename, double basicSalary, double medical) {
		this.empid=empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.medical = medical;
		this.HRA = 0.5 * basicSalary;
		this.PF = 0.12 * basicSalary;
		this.PT = 200;
	}

	public double calculateGrossSalary() {
		this.grossSalary = this.basicSalary + this.HRA + this.medical;
		return this.grossSalary;
	}

	public double calculateNetSalary() {
		this.netSalary = this.calculateGrossSalary() - this.PF - this.PT;
		return this.netSalary;
	}

	public void printEmployee() {
		System.out.println("Empid: " + this.empid);
		System.out.println("EName:" + this.ename);
		System.out.println("Gross:" + this.calculateGrossSalary());
		System.out.println("Net: " + this.calculateNetSalary());
	}

}
