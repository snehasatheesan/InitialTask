package practice;

public class program14 {

	public static void main(String[] args) {
		int [] hello=new int [] {3,9,2,7,1,5};
int  hello1[] =new int [hello.length];
for(int i=0;i<hello.length;i++) {
	hello1[i]=hello[i];
	
	
}
System.out.println("the elements of original array is ");
for(int i=0;i<hello.length;i++) {
	System.out.print(hello[i]+"");
	
}
System.out.println("");
System.out.println("the elements of new array is");
for (int i=0;i<hello1.length;i++) {
	System.out.print(hello1[i]+"");
}
System.out.println(" ");
	}

}
