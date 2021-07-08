//https://practice.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1
public class Factorial {

	static int fact(int n) {
		if(n==1)
			return 1;
		else {
			return (n*fact(n-1));
		}
		
	}
	public static void main(String[] args) {

		int n = 10;
		int res = fact(n);
		System.out.println("Factorail of "+n+" number = "+res);
	}

}
