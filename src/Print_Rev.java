// Print N to 1 Recursively
public class Print_Rev {

	static void print(int n) {
		if(n == 1) {
			System.out.println(1);
			return ;
		}
		else {
			System.out.println(n);
			print(n-1);
			return;
		}
	}
	
	public static void main(String args[]) {
		int n = 5;
		print(n);
	}
}
