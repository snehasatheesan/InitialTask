package practice;

public class program29 {

	public static void main(String[] args) {
		printC(4);
    }
    
    public static void printC(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
