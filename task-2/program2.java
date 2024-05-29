package practice;

public class program2 {

	public static void main(String[] args) {
		int marks=75;int age=60;int weight =55;
		if (marks>=85 & marks<=100){
			System.out.println("you have secured A grade");
			if(age<75|weight<=50) {
				System.out.println("you are eligible to be class rep");
			
			}
		}
		else if(marks>=70 &marks<=85){
			System.out.println("you have secured B grade");
			if(age>=60|weight<50) {
				System.out.println("you are not eligible to be class rep");
			}
		}
		else if(marks >=50 & marks<=70) {
			System.out.println("you have secured C grade");
		}
		else {
			System.out.println("sorry you failed");
		}

	}

}
