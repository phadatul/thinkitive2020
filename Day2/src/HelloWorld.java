
public class HelloWorld {
	public static void main(String[] args) {

		int a[] = { 90, 8, 67, 45, 7, 5 };
		for (int x = 0; x < a.length; x++) {
			int num = a[x];
			int count = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(a[x]);
			}
		}
	}

}
