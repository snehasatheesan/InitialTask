package practice;


	
		import java.util.ArrayList;
		import java.util.List;
		public class program30 {

		
		    public static void main(String[] args) {
		        int[][] matrix = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
		        List<List<Integer>> result = diagonalOrder(matrix);
		        System.out.println(result);
		    }
		    
		    public static List<List<Integer>> diagonalOrder(int[][] matrix) {
		        List<List<Integer>> result = new ArrayList<>();
		        int rows = matrix.length;
		        System.out.println("rows lenght:"+rows);
		        if (rows == 0) return result;
		        int cols = matrix[0].length;
		        System.out.println("cols lenght:"+cols);
		        for (int i = 0; i < rows + cols - 1; i++) {
		            List<Integer> diagonal = new ArrayList<>();
		            int row = (i < cols) ? 0 : i - cols + 1;
		            int col = (i < cols) ? i : cols - 1;

		            while (row < rows && col >= 0) {
		                diagonal.add(matrix[row][col]);
		                row++;
		                col--;
		            }
		            result.add(diagonal);
		        }
		        return result;
		        
		       
	}

		}
