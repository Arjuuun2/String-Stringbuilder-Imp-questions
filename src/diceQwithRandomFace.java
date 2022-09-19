import java.io.*;
import java.util.*;

public class diceQwithRandomFace {

	//Same question as previous wher it not will a 6 face dice, it will a random face
	//die
	//logic: same logic with the only difference is the only add a face as parameter and 
	//recursion formula
	public static void main(String[] args) {
		ArrayList<String> ans=new ArrayList<>();

		ans= diceRetRandomFace("",4,8);
		System.out.println(ans);
	}
	static ArrayList<String> diceRetRandomFace(String p, int target, int face){
		if(target==0) {
			ArrayList<String> empty=new ArrayList<>();
			empty.add(p);
			return empty;
		}
		
		ArrayList<String> die=new ArrayList<>();
		
		for(int i=1;i<=face && i<=target;i++) {
			die.addAll(diceRetRandomFace(p+i, target-i, face));
		}
		return die;
	}

}
