import java.io.*;

public class SubseandAscii {
 
	//In this program print ASCII value with subsequence
	
	public static void main(String[] args) {
		subsequence("","abcd");

	}
	static void subsequence(String p,String str) {
		
		if(str.isEmpty()) {
			System.out.println(p);
			return;//this return is very important otherwise there will be exception
			//at run time
		}
		
		char ch=str.charAt(0);
		
		subsequence(p+ch,str.substring(1));
		subsequence(p,str.substring(1));
		subsequence(p+(ch+0), str.substring(1));//recursive call to print ascii values
	}

}
