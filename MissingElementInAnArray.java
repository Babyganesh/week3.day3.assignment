  package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				
				// Sort the array	 
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		 List<Integer>newlist=new ArrayList<Integer>();
		 for (int i = 1; i < arr.length; i++) {
			 newlist.add(arr[i]);
			 if(i!=arr[i-1]) {
				 System.out.println(i);
	             break;
		}
		


	}}}


