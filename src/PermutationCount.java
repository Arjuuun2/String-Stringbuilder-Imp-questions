import java.io.*;
import java.util.*;

public class PermutationCount {

	//Program is to return the count of no of permutation occurs
	//logic of the program is same like permutations
	//just declare the count varible 
	//count returns 1 if any of the unprocessed string becomes zero
	public static void main(String[] args) {
		int ans=permutCount("","abc");
		System.out.println(ans);

	}
	
	static int permutCount(String p,String str) {
		
		if(str.isEmpty()) {
			return 1;
		}
		
		char ch=str.charAt(0);
		int count =0;
		
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0,i);
			            //mistake:instead of p i wrote str.length-please note that
			String l=p.substring(i, p.length());
			count=count+ permutCount(f+ch+l,str.substring(1));
		}
		return count;
	}

}
