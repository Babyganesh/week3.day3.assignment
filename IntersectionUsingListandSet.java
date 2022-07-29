package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionUsingListandSet {

	 //* a) Declare An array for {3,2,11,4,6,7};	 
	// * b) Declare another array for {1,2,8,4,9,7};
	//// * c) Declare for loop iterator from 0 to array length
	 //* d) Declare a nested for another array from 0 to array length
	 //* e) Compare Both the arrays using a condition statement
	 
	// *  f) Print the first array (shoud match item in both arrays)
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};

		List<Integer> arrayList1=new ArrayList<Integer>();
		for(int i:arr1)
			arrayList1.add(i);
		List<Integer> arrayList2=new ArrayList<Integer>();
		for(int i:arr2)
			arrayList2.add(i);
		arrayList1.retainAll(arrayList2);
		System.out.println(arrayList1+"duplicate in list");
}

}
