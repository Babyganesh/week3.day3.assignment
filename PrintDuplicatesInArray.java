package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//return; 
// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count 
	
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	
			// compare both the loop variables & check they're equal
		
					// increase the count if both the arrays are equal
			
	// Out of the inner loop, check and print the first array variable if count is more than 0
// TODO Auto-generated method stub



public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int n = arr.length;
		int count;
		List<Integer>newlist=new ArrayList<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j=i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
				
			}
          
		}} 
}