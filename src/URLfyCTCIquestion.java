import java.io.*;
import java.util.*;

public class URLfyCTCIquestion {

	//URLify: Write a method to replace all spaces in a string with '%20'.you may assume
	//that the string has sufficient space at the end to the hold the additional characters,
	//and that you are given the "true" length of the string.((Note: If implementing in Java, please use a character array so that you can 
	//perform this operation in place.) 
	
	//eg:input: "Mr John Smith    ", 13
	//output: "Mr%20John%20Smith"
	//here truelength is the length of the string included the space in them but not the 
	// extra space after the string
	
	
	//solution: here we are using two scan approach to get to the solution
	//ie, first we are counting from the straight order and count the no of spaces store 
	//it in counter.
	//2ndly we are iterating in reverse order to edit the space with %20
	
	public static void main(String[] args) {
		String str="Mr John Smith      ";
		char[] nstr=str.toCharArray();//converting string to character array
		//int truelength=str.length();
		urLify(nstr, 13);//str.trim().length());//here we are using string .trim length

	}
	
	static void urLify(char[] str, int truelength) {
		//step 1:we have to declare spacecount variable to count the no of space
		//also declare orgindex that is to iterate from back we need the original index
		//extra space
		                                  // a,h, ,d, ,j, , , , , 
		int spacecount=0,orgindex;
		for(int i=0;i<truelength;i++) {
			if(str[i]==' ') {
			spacecount++;
			}
		}
		
		orgindex=truelength+spacecount*2;//actually n-1 varies according to replace stuff
		//here we want to replace %20
		if(truelength<str.length) str[truelength]='\0';
		
		for(int i=truelength-1;i>=0;i--) {
			 if(str[i]==' ') {
				 str[orgindex-1]='0';
				 str[orgindex-2]='2';
				 str[orgindex-3]='%';
				 orgindex=orgindex-3;
			 }else {
				 str[orgindex-1]=str[i];
				 orgindex--;
			 }
		}
		
	}

}
