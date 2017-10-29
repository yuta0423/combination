package combination;

public class Combination_lib {
	private int s;
	
	public int getFactorial(int fact) {
		int r = 1;
		for(int i = 1; i <= fact; i++) {
			r = r * i;
		}
		return r;
	}	
	
}
