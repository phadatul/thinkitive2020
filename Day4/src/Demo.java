
public class Demo {
	public static void main(String[] args) {
		Employee a = new Employee(1, "ABCD");
		Employee b = new Employee(1, "ABCD");

		System.out.println(a);
		System.out.println(b);

		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//whenever two objects are equal  == equals method returns true and hashcode returns same
		//value for those objects

	}

}
