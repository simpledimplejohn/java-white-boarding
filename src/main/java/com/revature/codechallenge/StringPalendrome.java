package com.revature.codechallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPalendrome {
	/*
	 * Add a character to the begining of the string to make it a palandrome
	 * exp = "abab"
	 * add "b"
	 * 
	 * if the string cannot be a palandrome return "z"
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		String palandrome = "abab";
		String notPalandrome = "ghfjkadl";
		
		System.out.println("should be babab " + palFix(palandrome));
		System.out.println("Should be z " + palFix(notPalandrome));
		
		
		
		
	}

	private static String palFix(String str) {
		
		List<Character> charList = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
		}
		
//		System.out.println(Arrays.toString(charArr));
		
		char last = charList.get(charList.size()-1);
		
//		System.out.println(last);
		
		charList.add(0, last); 
		
//		System.out.println(charList);
		
		List<Character> revList = new ArrayList<>(charList);
		
		Collections.reverse(revList);
		
		if(charList.equals(revList)) {
			String answer = "";
			for(Character c : charList) {
				answer += c;
			}
			return answer;
		} 
		
		
		
		return "z";
	}
}
