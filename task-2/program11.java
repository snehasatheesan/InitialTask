package practice;
public class program11 {

	public static void main(String[] args) {
		 String input1 = "b3c6d15";
	        StringBuilder output = new StringBuilder();

	        for (int i = 0; i < input1.length(); i++)  {
	        char currentChar1 = input1.charAt(i);
	            if (Character.isLetter(currentChar1)) {
	                StringBuilder countBuilder = new StringBuilder();
	                while (i + 1 < input1.length() && Character.isDigit(input1.charAt(i + 1))) {
	                    countBuilder.append(input1.charAt(i + 1));
	                    i++;
	                }
	                
	                int repeatCount = countBuilder.length() > 0 ? Integer.parseInt(countBuilder.toString()) : 1;
	                for (int k= 0; k < repeatCount; k++) {
	                    output.append(currentChar1);
	                }
	            }
	        }

	        System.out.println("Output: " + output.toString());
	}
}

