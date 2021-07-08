//Print 1 to N Recursively
public class Print {

	static void print(int n) {
		if(n == 1) {
			System.out.println(1);
			return ;
		}
		else {
			print(n-1);
			System.out.println(n);
			return;
		}
	}
	
	public static void main(String args[]) {
		int n = 5;
		print(n);
	}
}
