package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program18 {

	public static void main(String[] args) {
	
		int[] input1 = {13, 2, 4, 15, 12, 10, 5};

        System.out.print("Output: ");
        sortOddEven(input1);
        for (int num : input1) {
            System.out.print(num + " ");
        }
    }

    public static void sortOddEven(int[] arr) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddList.add(arr[i]);
            } else {
                evenList.add(arr[i]);
            }
        }

       
        Collections.sort(oddList, Collections.reverseOrder());
Collections.sort(evenList);

        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = oddList.get(oddIndex++);
            } else {
                arr[i] = evenList.get(evenIndex++);
            }
        }
    }
	}
