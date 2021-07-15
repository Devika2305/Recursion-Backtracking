import java.util.Stack;

// Delete middle element of a stack and print the remaining elements of the stack
public class DelMidElement {

	private static Stack<Integer> midDel(Stack<Integer> st, int size) {

		if(size == 0) {
			
			return st;
		}
		int k = (size/2)+1;
		solve(st,k);
		return st;
	}
	
	private static void solve(Stack<Integer> st, int k) {

		if(k == 1) {
			st.pop();
			return;
		}
		int temp = st.peek();
		st.pop();
		solve(st,k-1);
		st.push(temp);
		return;
		
	}

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		int size = st.size();
		System.out.println("Original Stack ");
		System.out.println(st);
		System.out.println("Stack after deleting middle element");
		midDel(st,size);
		System.out.println(st);
	}	
}
