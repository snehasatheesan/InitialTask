package practice;

public class program13 {

	public static void main(String[] args) {
		int []arr=new int[] {12,89,9,65,34};
		int minvalue=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minvalue) {
				minvalue=arr[i];
			}
		}
			System.out.println("the smallest element in this array is:"+minvalue);
		}

	}


