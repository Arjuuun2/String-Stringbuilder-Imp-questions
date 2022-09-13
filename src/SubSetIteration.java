import java.io.*;
import java.util.*;

public class SubSetIteration {

	//In this program we demonstrate subset of an array using iteration
	//we will create a method that will return List of list: ie, an outer list 
	//and an inner list
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4};
		List<List<Integer>> ans=subSet(arr);
		
		//for(int i=0;i<arr.length;i++) {
			System.out.println(ans);
		//}

	}
	
	static List<List<Integer>> subSet(int[] arr){
		
		List<List<Integer>> outer=new ArrayList<>();
		
		outer.add(new ArrayList<>());//1:adding an empty list to the outer list
		
		for(int num: arr) {
			int n=outer.size();
			for(int i=0;i<n;i++) {
				List<Integer> inner=new ArrayList<>(outer.get(i));
				inner.add(num);
				outer.add(inner);
			}
		}
		return outer;
	}

}
