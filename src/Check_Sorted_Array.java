public class Check_Sorted_Array {

	static boolean checkSorted(int arr[],int n) {
		if(n==0) {
			return true;
		}
		if(arr[n] > arr[n-1]) {
			return checkSorted(arr,n-1);	
		}
		return false;
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		int b[]= {9,8,5,4,7,1,6};
		
		System.out.println(checkSorted(a,6));
		System.out.println(checkSorted(b,6));
	}
}
