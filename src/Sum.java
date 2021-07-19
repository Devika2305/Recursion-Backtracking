
public class Sum {

	static int sum(int n) {
		if(n==1)
			return 1;
		else {
			return (n+sum(n-1));
		}
		
	}
	public static void main(String[] args) {

		int n =5;
		int res = sum(n);
		System.out.println("Sum of "+n+" natural nos = "+res);
	}

}
