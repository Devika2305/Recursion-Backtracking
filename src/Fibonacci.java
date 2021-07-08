
public class Fibonacci {

		static int fibo(int n) {
			if(n == 0)
				return 0;
			if(n == 1 || n == 2)
				return 1;
			
			return fibo(n-1) + fibo(n-2); 
		}
		public static void main(String[] args) {

			int n = 5;
			for(int i =0;i<n;i++) {
				System.out.println(fibo(i)+" ");
			}			
	}

}
