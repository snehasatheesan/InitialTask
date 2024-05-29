package practice;

import java.util.Scanner;

public class program24 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        printPyramid(n);
    }

    public static void printPyramid(int n) {
        int currentNumber = 1;
        int rows = 0;
        while (rows * (rows + 1) / 2 < n) {
            rows++;
        }

        int count = 0;
        for (int i = 1; i <= rows; i++) {
           
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                if (currentNumber <= n) {
                    System.out.print(currentNumber + " ");
                    currentNumber++;
                }
            }
           
            System.out.println();
        }
    }
}