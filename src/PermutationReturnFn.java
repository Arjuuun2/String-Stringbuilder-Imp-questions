import java.io.*;
import java.util.*;

public class PermutationReturnFn {

	//This program to find permutation of a string, this is literaly the exact problem 
	//previous to this, but return type to arrayList
	//same logic as earlier program
	public static void main(String[] args) {
		
		ArrayList<String> nlist=new ArrayList<>();
		
		nlist=permutation("","abc");
		System.out.println(nlist);

	}
	
	static ArrayList<String> permutation(String p,String s){
		
		
		if(s.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> mylist=new ArrayList<>();
		char ch=s.charAt(0);
		
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0, i);
			String l=p.substring(i, p.length());
		mylist.addAll(permutation(f+ch+l,s.substring(1)));
		}
		return mylist;
	}

}
