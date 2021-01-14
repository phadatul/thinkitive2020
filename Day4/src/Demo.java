import one.Hello;

public class Demo {
	public static void main(String[] args) {

		Employee e1 = new Employee("1", "ABCD");
		Employee e2 = new Employee("1", "ABCD");
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		
	}

}
