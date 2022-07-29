package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateUsingList {
	 //* a) Use the declared String text as input
	//String text = "We learn java basics as part of java sessions in java week1";		
 //* b) Initialize an integer variable as count	  
// * c) Split the String into array and iterate over it 
// * d) Initialize another loop to check whether the word is there in the array
// * e) if it is available then increase and count by 1. 
// * f) if the count > 1 then replace the word as "" 
//* g) Displaying the String without duplicate words	
	  

	public static void main(String[] args) {
	 //  Use the declared String text as input
	      String text = "We learn java basics as part of java sessions in java week1";
	  	 
	  //  Split the String into array and iterate over it 
	     String[] split = text.split(" ");	    
	  //use set
	     Set<String> duplicate=new LinkedHashSet<String>(Arrays.asList(split));	     
	  //using for each loop
	     for(String output:split) {
	    	 //add the output
	    	 duplicate.add(output);
	     }
	     List<String>list=new ArrayList<String>(duplicate);
	     System.out.println(list);
	     for(int i=0; i<list.size()-1; i++)
	     {
	    	 System.out.println(list.get(i));
	     }

	

	}

}
