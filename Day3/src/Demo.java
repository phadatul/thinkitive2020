
public class Demo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "ABC", 10000, 2000);
		Manager m1 = new Manager(2, "MGR", 10000, 2000);
		MarketingExecutive mar1 = new MarketingExecutive(3, "MAR", 10000, 2000, 50);

		e1.printEmployee();
		m1.printEmployee();
		mar1.printEmployee();

	}

}
