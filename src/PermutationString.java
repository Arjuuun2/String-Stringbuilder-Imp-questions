import java.io.*;
import java.util.*;

public class PermutationString {

	//Program to find all the permutations of a string array 
	//no return type program 
	//this logic is similar to subsequence pattern 
	//we are taking two strings processed and unprocessed
	//but the recursive fun calls are variable according to the processed string 
	public static void main(String[] args) {
		
		permutation("","abc");
		//System.out.println("after calling");
		//permutation("","abc");
	}
	
	static void permutation(String p, String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		    //huge mistake i made is i<p.length and the function did not work##checkpoint 
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			permutation(f +ch+ s, up.substring(1));
		}
		
	}

}
