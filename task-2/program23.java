package practice;

public class program23 {

	public static void main(String[] args) {
		int hello=9;
		int print=hello;
		  
		for (int i= 0; i<= hello-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=hello-1-i; k++)  
		{  
		//

			System.out.print(print + " ");
			
		}  
		print--;
		
		System.out.println(); 

	}
	}
}
