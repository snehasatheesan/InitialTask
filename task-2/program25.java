package practice;



public class program25 {
	 static void pattern(String str, int len)
	 {
	for (int i = 0; i < len; i++) { 
		 int j = len - 1 - i; 
        for (int k = 0; k < len; k++) { 
            if (k == i || k == j) 
                System.out.print(str.charAt(k)); 

            else
                System.out.print(" "); 
        } 
        System.out.println(""); 
    } 
} 


public static void main(String[] args) 
{ 
    String str = "12345"; 
    int len = str.length(); 
    pattern(str, len);
	
	
}
}