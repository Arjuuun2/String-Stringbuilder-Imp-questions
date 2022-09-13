import java.io.*;

public class StringBuild {

	//program to demonstrate StringBuilder class
	public static void main(String[] args) {
		//representing StringBuilder using normal for loop 
		StringBuilder sentence=new StringBuilder();
		
		for(int i=0;i<24;i++) {
			char s=(char) ('a'+ i);//check to put bracket on char and a +i
			sentence.append(s);
		}
		System.out.println(sentence.toString());//here check to put sentence(object name
		//of stringbuilder) 

		
		//Representing StringBuilder class with enhanced for loop 
		String[] name={"soman"};
		for(String w:name ) {
			sentence.append(w);
		}
		System.out.println(sentence.toString());
	}

}
