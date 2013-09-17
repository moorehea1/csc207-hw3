
// Author: Kyle Moorehead
// Homework 3, parts A,B,C,D

package edu.grinnell.csc207.moorehea1.hw3;

public class StringUtils {

	public static String[] splitAt(String text, char split) throws Exception {
		
		int i = 0;
		char splitText = text.charAt(i);
		int start = 0;
		int end = 0;
		String[] sub = new String[text.length()];
		
		
		for (i=0; i<text.length(); i++) {
			if (splitText != split) {
				sub[start] = text.substring(start, end);
				start++;
				end = start;
			} //if				
		} //for
		
		return sub;
		
	} //splitAt
	
	public static String[] splitCSV(String str) throws Exception {
		
	} //splitCSV
	
	public static String deLeet(String letter) throws Exception { //.replace found at http://stackoverflow.com/a/1234518
		letter.replace("b", "|3");
		letter.replace("B", "|3");
		letter.replace("t", "+");
		letter.replace("T", "+");
		letter.replace("e", "3");
		letter.replace("E", "3");
		letter.replace("o", "0");
		letter.replace("O", "0");
		letter.replace("n", "|\\|");
		letter.replace("N", "|\\|");
		letter.replace("l", "1");
		letter.replace("L", "1");
		letter.replace("a", "@");
		letter.replace("A", "@");
		return letter;	
	} //deLeet
	
	public static String nameGame(String name) throws Exception {
		
		String endName = "";
		
		for (int i = 0; i<name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'y') {
				endName = name.substring(i);
				break;
			} //if
		} //for
		String verse = name + '!' + '\n';
		verse += name + ", " + name + " bo B" + endName + "Bonana fanna fo F" + endName + '\n';
		verse += "Fee fy mo M" + endName + ", " + name + '!';
		return verse;
	} //nameGame
} //StringUtils
