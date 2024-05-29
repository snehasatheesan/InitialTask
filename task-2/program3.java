package practice;

import java.util.ArrayList;
import java.util.List;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int totalStudents = 20;
	        int groups = 4;

	        List<Integer>[] studentGroups = splitStudentsIntoGroups(totalStudents, groups);

	        for (int i = 0; i < groups; i++) {
	            System.out.println("Group " + (i + 1) + ":");
	            for (int rollNumber : studentGroups[i]) {
	                System.out.println(rollNumber);
	            }
	        }
	    }

	    public static List<Integer>[] splitStudentsIntoGroups(int totalStudents, int groups) {
	        List<Integer>[] studentGroups = new ArrayList[groups];
	        for (int i = 0; i < groups; i++) {
	            studentGroups[i] = new ArrayList<>();
	        }

	        int rollNumber = 101;
	        int groupIndex = 0;
	        for (int i = 0; i < totalStudents; i++) {
	            studentGroups[groupIndex].add(rollNumber);
	            rollNumber++;
	            groupIndex = (groupIndex + 1) % groups;
	        }

	        return studentGroups;
	    
	}

}
