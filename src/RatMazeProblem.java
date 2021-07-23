//https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
// Rat can move in only two directions - Down and Right
public class RatMazeProblem {

	static int N = 4;
	static int maze[][] = {{1,0,0,0},
						   {1,1,0,1},
						   {1,1,0,0},
						   {0,1,1,1}};
	
	static int soln[][] = {{0,0,0,0},
						   {0,0,0,0},
						   {0,0,0,0},
						   {0,0,0,0}}; 

	static boolean solveMaze(int row, int col) {
		if(row == N-1 && col == N-1) {
			soln[row][col] = 1;
			return true;
		}
		if(isValid(row,col) == true) {
			soln[row][col] = 1;
		
			if(solveMaze(row+1,col) == true) {
				System.out.print("R ");
				return true;
			}
			if(solveMaze(row,col+1) == true) {
				System.out.print("D ");
				return true;
			}
			
			soln[row][col] = 0;
			return false;
		}
		return false;
	}
	
	static boolean isValid(int row, int col) {
		if(row >= 0 && col >= 0 && row < N && col < N && maze[row][col] == 1)
			return true;
		return false;
	}

	static void print() {
		System.out.println();
		for(int i =0;i<N;i++) {
			for(int j =0;j<N;j++)
				System.out.print(" "+soln[i][j]+" ");
			System.out.println();
		}
	}
	
	static boolean ratMaze(){
		if(solveMaze(0,0) == false)
		{
			System.out.println("No solution for the maze");
			return false;
		}
		print();
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Solution for the maze ");
		ratMaze();
	
	}

}
