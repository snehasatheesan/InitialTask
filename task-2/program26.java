package practice;

import java.util.Scanner;

public class program26 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the input number: ");
	        int n = scanner.nextInt();
	        
	        printPattern(n);
	    }

	    public static void printPattern(int n) {
	        int totalRows = 2 * n;
	        for (int i = 0; i < totalRows; i++) {
	            if (i < n) {
	                printLine(i, n);
	            } else {
	                printLine(totalRows - i - 1, n);
	            }
	        }
	    }

	    public static void printLine(int i, int n) {
	        int stars = n - i;
	        int underscores = 2 * i;

	        // Print leading stars
	        for (int j = 0; j < stars; j++) {
	            System.out.print("*");
	        }

	        // Print underscores
	        for (int j = 0; j < underscores; j++) {
	            System.out.print("_");
	        }

	        // Print trailing stars
	        for (int j = 0; j < stars; j++) {
	            System.out.print("*");
	        }

	        // Move to the next line
	        System.out.println();
	    }
	}	