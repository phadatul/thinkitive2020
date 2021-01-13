
public class AdvancedCalculator extends Calculator {
	
	public AdvancedCalculator() {
		
		System.out.println("ADV Calculator");
	}

	public int fact(int num) {
		int ans = 1;
		for (int i = num; i > 0; i--) {
			ans = ans * i;
		}
		return ans;
	}

	@Override
	public int divide(int a, int b) {
		System.out.println(super.divide(a, b));
		return a % b;
	}

}
