import java.io.*;
import java.util.*;

public class DiceQreturnArrayList {

	//same question as amazon dice(previous). the only thing is to return it to arraylist
	public static void main(String[] args) {
		ArrayList<String> ans=new ArrayList<>();
        ans=diceReturn("",4);
        System.out.println(ans);

	}
	
	static ArrayList<String> diceReturn(String p,int target){
		if(target==0) {
			ArrayList<String> empty=new ArrayList<>();
			empty.add(p);
			return empty;
		}
		
		ArrayList<String> dice=new ArrayList<String>();
		
 //check here for i=1 
		for(int i=1;i<=6 && i<=target;i++) {
			dice.addAll(diceReturn(p+i,target-i));
		}
		return dice;
	}

}
