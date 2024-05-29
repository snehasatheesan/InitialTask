package practice;

import java.util.Scanner;

public class program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String string2 = scanner.nextLine();

        int index = findSubstring(string1, string2);

        if (index != -1) {
            System.out.println("Output: " + index);
        } else {
            System.out.println("Output: -1");
        }
    }

    public static int findSubstring(String string1, String string2) {
        return string1.indexOf(string2);
    
	}

}
