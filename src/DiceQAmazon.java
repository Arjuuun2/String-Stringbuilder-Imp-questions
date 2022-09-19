import java.io.*;
import java.util.*;


public class DiceQAmazon {

	//This is an amazon problem following the same pattern as combination
	//Q:In a dice thrown how many ways to form 4 in a die
	
	//logic of the program : observe: we need to take an array of 6 element and loop
	//through only till the target here 4.
	//follow the same previous patterns
	//formula (processed +i, target-i)
	public static void main(String[] args) {
		dice("",4);
		
	}
	
	static void dice(String p, int target) {
		//base condition
		if(target==0) {
			System.out.println(p);
			return;
		}
//mistake(i made):i=0 here	that will not work the program properly                
		for(int i=1;i<=6 && i<=target;i++) {
			dice(p+i, target-i);//formula
		}
		
		
	}

}
