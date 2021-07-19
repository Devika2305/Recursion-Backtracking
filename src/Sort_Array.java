
public class Sort_Array {

	static void sort( int[] arr, int len) {
		
		if(len == 1)
			return ;

		for(int j =0;j<len-1;j++) {
			if(arr[j+1]<arr[j]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
		sort(arr,len-1);
	}
	
	
	public static void main(String[] args) {

		int arr[] = {9,8,7,6,5,4,3,2,1};
		int len = arr.length;
		System.out.println("Original Array");
		for(int i : arr)
			System.out.print(i+" ");
		sort(arr,len);
		System.out.println();
		System.out.println("Sorted Array");
		for(int i : arr)
			System.out.print(i+" ");
		
	}

}
