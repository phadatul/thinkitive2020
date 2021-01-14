
public class Employee {
	int empid;
	String ename;

	public Employee() {

	}

	Employee(int empid, String ename) {
		this.empid = empid;
		this.ename = ename;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.empid == e.empid) {
			return true;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		
		return this.empid;
	}

	@Override
	public String toString() {

		return "ID:" + this.empid + ",NAME:" + this.ename;
	}
}
