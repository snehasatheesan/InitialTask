package practice;

import java.util.Scanner;

public class program28 {
public static  void main(String [] args ) {
	   Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter the number of terms: ");
       int n = scanner.nextInt();
       
       int sum = 0;
       int currentTerm = 0;
       
       System.out.print("The series is: ");
       for (int i = 1; i <= n; i++) {
           currentTerm = currentTerm * 10 + 1;
           sum += currentTerm;
           
           System.out.print(currentTerm);
           if (i < n) {
               System.out.print(" + ");
           }
       }
       
       System.out.println();
       System.out.println("The sum is: " + sum);
}
	

}