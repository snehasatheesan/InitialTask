package practice;

public class program21 {

	public static void main(String[] args) {
		
		         int x = 9;
		        for (int i = 1; i <= x; i++) {
		            for (int j = 1; j <= x - i; j++)
		                System.out.print("   ");
		            for (int k = i; k >= 1; k--)
		                System.out.print((k >= 10) ? +k : "  " + k);
		            for (int k = 2; k <= i; k++)
		                System.out.print((k >= 10) ? +k : "  " + k);
		            System.out.println();
		        }
		    }
		

	}


