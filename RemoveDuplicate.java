package week3.day2.assignment1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

		public static void main(String[] args) {
			 
			 //* a) Use the declared String text as input
				//String text = "We learn java basics as part of java sessions in java week1";		
			 //* b) Initialize an integer variable as count	  
			// * c) Split the String into array and iterate over it 
			// * d) Initialize another loop to check whether the word is there in the array
			// * e) if it is available then increase and count by 1. 
	       // * f) if the count > 1 then replace the word as "" 
		 //* g) Displaying the String without duplicate words	

			// a) Use the declared String text as input
	      String text = "We learn java basics as part of java sessions in java week1";
	      //* b) Initialize an integer variable as count	 
	      int count=0;
	   // * c) Split the String into array and iterate over it 
	     String[] split = text.split(" ");
	    
	     //use set
	     Set<String> duplicate=new LinkedHashSet<String>(Arrays.asList(split));
	     //using for each loop
	     for(String output:split) {
	    	 //add the output
	    	 duplicate.add(output);
	     }
	  //syso outpt
	    System.out.println(duplicate);
	 //condition
		for (int i = 0; i < split.length; i++) 
		{
			count=1;
			//if it is available then increase and count by 1.
			for (int j =i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					count++;
					
				}
				
				
			}
			//if the count > 1 then replace the word as "" 
			
			//if(count>1&&split[i]!="0") {
				// System.out.println("duplicate word in string");
				//System.out.println(split[i]);
			}}}

	


