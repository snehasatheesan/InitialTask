package practice;

public class program15 {

	public static void main(String[] args) {
		int num1[]=new int[] {3,4,5,6,7,8,2,3,7,1,4};

System.out.println("the duplicate numbers are:");
for(int i=0;i<num1.length;i++) {
	for(int j=i+1;j<num1.length;j++) {
		if(num1[i]==num1[j])
		System.out.println(num1[j]);
	}
}
	}

}
