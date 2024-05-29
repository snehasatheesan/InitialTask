package practice;

import java.util.ArrayList;
import java.util.List;

public class program16 {

	public static void main(String[] args) {
	int	array1[]= { 2,4,5,6,7,9,10,13};
	int array2[]= {2,3,4,5,6,7,8,9,11,15};
	int[] mergedArray = mergeArrays(array1, array2);

    System.out.print("Merged Array: ");
    for (int num : mergedArray) {
        System.out.print(num + " ");
    }
}

public static int[] mergeArrays(int[] array1, int[] array2) {
    List<Integer> mergedList = new ArrayList<>();
    int i = 0, j = 0;

    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            MergedList(mergedList, array1[i]);
            i++;
        } else if (array1[i] > array2[j]) {
            MergedList(mergedList, array2[j]);
            j++;
        } else {
            MergedList(mergedList, array1[i]);
            i++;
            j++;
        }
    }

    while (i < array1.length) {
        MergedList(mergedList, array1[i]);
        i++;
    }

    while (j < array2.length) {
        MergedList(mergedList, array2[j]);
        j++;
    }

    int[] mergedArray = new int[mergedList.size()];
    for (int k = 0; k < mergedList.size(); k++) {
        mergedArray[k] = mergedList.get(k);
    }

    return mergedArray;
}

private static void MergedList(List<Integer> mergedList, int value) {
    if (mergedList.isEmpty() || mergedList.get(mergedList.size() - 1) != value) {
        mergedList.add(value);
    }
}
}