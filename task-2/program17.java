package practice;

import java.util.Arrays;

public class program17 {

	public static void main(String[] args) {
		 int[] b = { 1, 2, 3, 4, 5, 6 ,7};
	       
	        int n = b.length;
	        
	        int[] last = new int[n];
	       
	        int minVal = 0;
	        int maxVal = n - 1;
	        int num = 0;
	        for (int i = 0; i < n; i++) {
	            
	            if (num% 2 == 0) {
	                last[i] = b[maxVal];
	                maxVal -= 1;
	            }
	           
	            else {
	                last[i] = b[minVal];
	                minVal += 1;
	            }
	            
	            num ++;
	        }
	 
	       System.out.println(Arrays.toString(last));

	}

}
