package practice;

public class program6 {
int a=2;int b=4;
int c=a*=b+5 ;


	public static void main(String[] args) {
		int a=8;int b=3;
		int c=++a-b--; //8 gets preincremented and becomes 9, b=3 so 9-3=6
        System.out.println(c);
        int d=7;int e=2;
        int f=a%b++;
        System.out.println(f);//7%2=1 
        int s=4;int t=8;
		s=t+5 ;// sum of b+5 is 13, and then this sum is multiplied to 'a' which is 52
		System.out.println(a);
		
		
		
int v=28;
d+=d++ + ++d + --d + d--;
System.out.println(d);//28+29+30+29+28=144



int x=69>>>3;
System.out.println("x value:"+x);
       
	}

}
