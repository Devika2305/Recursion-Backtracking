
public class Power {

	// reduced complexity 
	static int fastpow(int a , int b) {
		if(b==0)
			return 1;
		if(b%2 == 0)
			return fastpow(a*a,b/2);
		return a*fastpow(a,b-1);
	}
	
	
	//worst complexity
	static int power(int a, int b) {
		if(b==0)
			return 1;
		else {
			return (power(a,b-1)*a);
		}
		
	}
	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		int res = fastpow(a,b);
		System.out.println(a+"^"+b+" = "+res);
	}

}
