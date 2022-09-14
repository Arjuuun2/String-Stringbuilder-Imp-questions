import java.io.*;
import java.util.*;

public class SubSetDuplicate {

	//This program to print subset contains duplicate elements
	//eg: {1,2,2}
	//using nested for loop 
	//similar to subset program difference is we are taking two pointers start and end
	//start from 0, if we find duplicate element start(i=i-1) then we will put start as
	//end +1 
	//then add start will be set to j and create an internal ArrayList and add arr[i] to
	//to internal 
	public static void main(String[] args) {
		int[] arr= {1,2,2};
		List<List<Integer>> ans=subSetDupe(arr);

		for(List<Integer> nums: ans) {
			System.out.println(nums);
			
		}
		
	}
	static List<List<Integer>> subSetDupe(int[] arr){
		Arrays.sort(arr);//this caused me exception 
   List<List<Integer>> outer=new ArrayList<>();
   
		//if(arr.length==1) {
			outer.add(new ArrayList<>());
			
		//}
		
		int start=0;//adding two pointers start and end
		int end=0;
		
		for(int i=0;i<arr.length;i++) {
			start=0;
			if(i>0 && arr[i]== arr[i-1]) {//the two elements are same(then its duplicate)
				start=end +1;//next element after the end
			}
			end=outer.size()-1;//declaring end to the last//one mistake i made is that i put
			//end as array.length-1
			//nested for loop
			   //here also i made mistake ie, instead of j=start i put j=0
			int n=outer.size();
			for(int j=start;j<n;j++) {
				List<Integer> internal=new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
		
	}

}
