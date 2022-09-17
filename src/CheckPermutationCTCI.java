import java.io.*;
import java.util.*;

public class CheckPermutationCTCI {

	  //Cracking the coding interview problem no:1.2
	//Check permutation:Given two, write a method to decide if one is a permutation of the 
	//other
	
	//observe first strings of different lengths cannot be permutations of each other.
	//logic of the program: sort the strings therefore the permutations will be in same order
	//final step compare the strings.
	public static void main(String[] args) {
		boolean ans=checkperm("animal", "malani");
      System.out.println(ans);
	}
	
	static String sort(String s) {
		char[] ar=s.toCharArray();//changing string to character array
	    Arrays.sort(ar); //sorting the array         
	    return new String(ar);  
	}
	
	static boolean checkperm(String one, String two) {
		//base condition: checking the length of the two strings
		//if length is not same return false
		if(one.length()!=two.length()) {
			return false;
		}
		  //mistake:first time i forget to write sort here 
		return sort(one).equals(sort(two));
		
	}

}
