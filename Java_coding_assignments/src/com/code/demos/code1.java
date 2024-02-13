package com.code.demos;

import java.util.Arrays;

public class code1 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="readable content of a page when looking at its layout";
		
		String[] words = input.split("\\s");
		
		Arrays.sort(words,(s1,s2)->Integer.compare(s2.length(), s1.length()));
		
		String sortedstring = String.join(" ", words);
		System.out.println(sortedstring);
		
   System.out.println("this is our task ");
   
	}

}
