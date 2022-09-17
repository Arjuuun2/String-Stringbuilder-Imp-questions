import java.io.*;
import java.util.*;

public class LeetCodeLetterCombination {

	//frequently asked google question
	//Letter combinations of a phone number(leetcode question)
	//https://leetcode.com/problems/letter-combinations-of-a-phone-number/---link
	
	//find the no of possible combination of 2-9 digits to strings are represent
	
	public static void main(String[] args) {
      	combofPhon("","12");	

	}
	static void combofPhon(String p,String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit=up.charAt(0) -'0'; //up strings 1st digit
		
		for(int i=(digit-1)*3;i<digit * 3;i++) {
			char ch= (char)('a'+i);
			combofPhon(p+ch,up.substring(1));
		}
		
		
		
	}

}
