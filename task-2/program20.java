package practice;

public class program20 {

	public static void main(String[] args) {
		 int rows = 9; // Number of rows in the triangle
	        
	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            
	            // Print numbers in increasing order
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            
	            // Print numbers in decreasing order
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }
	            
	            System.out.println(); // Move to the next line
	        }

	}

}
