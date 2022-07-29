package week3.day2.assignment1;

import java.util.Arrays;

public class FindSecondLargest {
  
	public static void main(String[] args) {
		// Pseudo Code:
				// 1) Arrange the array in ascending order
				// 2) Pick the 2nd element from the last and print it
           // enter the input
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("second largest"+ data[data.length-2]);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
}}}
