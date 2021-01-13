
public class Demo {
	public static void main(String[] args) {
		int a[] = { 34, 4, 2 };
		int b[] = { 2, 34, 4 };

		int count = 0;
		for (int x : a) {
			for (int y : b) {
				if (x == y) {
					count++;
					break;
				}
			}
		}
		
		if(count==a.length && count==b.length) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
	}

}
