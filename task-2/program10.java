package practice;

import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		String result = "";
		
		for(int i=arr.length-1;i>=0;i--) {
			result +=(arr[i]+" ");
		}
		System.out.println(result);
		

	}

}
