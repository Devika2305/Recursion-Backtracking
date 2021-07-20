//https://leetcode.com/problems/k-th-symbol-in-grammar/
public class KthGrammar {
	
	static int solve(int n , int k) {
		if (n==1)
			return 0;
		int p = solve(n-1, k/2+k%2);
		boolean odd = k%2==1;
		if(p==1)
		{
			if(odd == true)
				return 1;
			else
				return 0;			
		}
		else {
			if(odd == true)
				return 0;
			else
				return 1;
		}
	}
	
//	static int solve(int n, int k) {
//		if(n==1 && k==1)
//			return 0;
//		int mid = (2^n-1)/2;
//		if(k <= mid)
//			return solve(n-1, k);
//		else
//			return !(solve(n-1, k-mid);
//	}
	
	public static void main(String[] args) {

		/* n=3(rows) k=1(position)		for 0 -> 0 1 && for 1 -> 1 0
		 grammar generated will be   
		 0
		 0 1
		 0 1 1 0 
		 0 1 1 0 1 0 0 1
		 OUTPUT will be 0 for k = 1
		 */
		int n = 4;
		int k = 6;
		int res = solve(n,k);
		System.out.println("Result = "+res);
	}

}
