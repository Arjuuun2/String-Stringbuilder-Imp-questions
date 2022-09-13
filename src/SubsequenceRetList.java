import java.io.*;
import java.util.*;

public class SubsequenceRetList {

	//this program is find subsequence of a string but the return type is Arraylist
	//Similar to subsequence program only difference is create an arraylist inside the
	//if condition
	
	public static void main(String[] args) {
		
System.out.println(subsequence("","animal"));
	}
	
	static ArrayList<String> subsequence(String p,String up){
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
	char ch=up.charAt(0);
	
	ArrayList<String> left= subsequence(p,up.substring(1));
	ArrayList<String> right=subsequence(p+ch,up.substring(1));
	
	//to reverse the subsequence change subsequence(ch+p,up.substring(1)); this is the answer
	//to the question that is print subsequence in reverse order
	
	right.addAll(left);
	
	return right;
		
	}

}
