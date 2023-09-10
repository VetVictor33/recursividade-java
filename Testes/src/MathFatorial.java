
public class MathFatorial {
	
	public static int recursiveFatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * recursiveFatorial(--num);
	}
}
