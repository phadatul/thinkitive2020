
public class Calculator {

	/*
	 * public int add(int a, int b) { System.out.println("int"); return a + b; }
	 */

	public int add(int... a) {  //VARARGS
		int ans=0;
		for(int x:a) {
			ans=ans+x;
		}
		return ans;
	}

	

}
