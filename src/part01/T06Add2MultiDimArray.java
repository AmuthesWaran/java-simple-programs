package part01;

public class T06Add2MultiDimArray {

	public static void main(String[] args) {
		
//		Java Program to Add Two Matrix Using Multi-dimensional Arrays

		int rows = 2;
		int cols = 3;
		
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] matrix2 = {{4, 5, 6}, {7, 8, 9}};
		
		int[][] sum = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j]; 
			}
		}
		
		System.out.println("Sum of 2 matrix is: ");
		for(int[] row : sum) {
			for (int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		
	}

}
