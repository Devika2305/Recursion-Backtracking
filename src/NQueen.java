//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
public class NQueen {

	int N = 4;
	
	void print(int board[][]) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) 
				System.out.print(" "+board[i][j]+" ");
			System.out.println();	
		}
		System.out.println();
	}
	
	boolean solveNQ(int board[][],int col) {
		if(col == N) {
			print(board);
			return true;
		}
		for(int row = 0;row<N;row++) {
			if(isSafe(board,row,col)) {
				board[row][col] = 1;
				if(solveNQ(board,col+1) == true)
					return true;
				board[row][col] = 0;
			}
		}
		return false;
	}
	
	private boolean isSafe(int[][] board, int row, int col) {
		int i,j;
		for(i=0;i<col;i++) {
			if(board[row][i] == 1)
				return false;
		}
		for(i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(board[i][j] == 1)
				return false;
		}
		for(i=row,j=col;j>=0 && i<N;i++,j--) {
			if(board[i][j] == 1)
				return false;
		}
		return true;
	}

	void NQUEEN() {
		int board[][] = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) 
				board[i][j] = 0;
		}
		//print(board);   //prints empty board
		if(solveNQ(board,0) == false) {
			System.out.println("Solution does not exist");
			return;
		}
		//System.out.println("\n Solution (1 represents the Queens placed)");
		//print(board);
		return;
		
	}
	public static void main(String[] args) {
	
		NQueen nq = new NQueen();
		nq.NQUEEN();
	}

}
