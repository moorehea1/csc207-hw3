package edu.grinnell.csc207.moorehea1.hw3;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	 @Test
	 public void testSplitAt() { //testing for splitAt taken from http://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2013F/assignments/current.html
	 assertArrayEquals(new String[] { "a", "b", "c" },
		StringUtils.splitAt("a:b:c", ':'));
	 assertArrayEquals(new String[] { "a", "b", "c" },
		StringUtils.splitAt("a b c", ' '));
	 assertArrayEquals(new String[] { "a:b:c" },
	    StringUtils.splitAt("a:b:c", ' '));
	 assertArrayEquals("one field", new String[] { "a" },
	    StringUtils.splitAt("a", ':'));
	 assertArrayEquals("empty inner field", new String[] { "", "" },
	    StringUtils.splitAt(":", ':'));
	 assertArrayEquals("leading empty field", new String[] { "", "a" },
	    StringUtils.splitAt(":a", ':'));
	 assertArrayEquals("trailing empty field", new String[] { "a", "" },
	    StringUtils.splitAt("a:", ':'));
	 } //testSplitAt
	
	 @Test
	 public void testSplitCSV() { //testing for splitCSV taken from http://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2013F/assignments/current.html
	 assertArrayEquals(new String[] { "a", "b", "c" },
        StringUtils.splitCSV("a,b,c"));
	 assertArrayEquals(new String[] { "a,b", "c" },
        StringUtils.splitCSV("\"a,b\",c"));
	 assertArrayEquals(new String[] { "a", "b,b\"", "c" },
        StringUtils.splitCSV("a,\"b,b\"\"\",c"));
		 
	@Test 
	public void testDeLeet() {
		assertEquals("e", "e", StringUtils.deLeet("3")); //The first 3 tests are taken from http://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2013F/assignments/current.html
		assertEquals("leet", "leet", StringUtils.deLeet("133+"));
		assertEquals("eat banana", "eat banana", StringUtils.deLeet("3@+ |3@|\\|@|\\|@"));
		
		assertEquals("b", "b",  StringUtils.deLeet("|3"));
		assertEquals("t", "t",  StringUtils.deLeet("+"));
		assertEquals("o", "o",  StringUtils.deLeet("0"));
		assertEquals("n", "n",  StringUtils.deLeet("|\\|"));
		assertEquals("l", "l",  StringUtils.deLeet("1"));
		assertEquals("a", "a", StringUtils.deLeet("@"));
		assertEquals("E", "E", StringUtils.deLeet("3"));
		assertEquals("B", "B",  StringUtils.deLeet("|3"));
		assertEquals("T", "T",  StringUtils.deLeet("+"));
		assertEquals("O", "O",  StringUtils.deLeet("0"));
		assertEquals("N", "N",  StringUtils.deLeet("|\\|"));
		assertEquals("L", "L",  StringUtils.deLeet("1"));
		assertEquals("A", "A", StringUtils.deLeet("@"));
	} //testDeLeet
	 
	@Test
	public void testNameGame() {
		assertEquals("Kyle", "Kyle!\nKyle, Kyle bo Byle Bonana fanna fo Fyle\nFee fy mo Myle, Kyle!",
				StringUtils.nameGame("Kyle"));
		assertEquals("Nick", "Nick!\nNick, Nick bo Bick Bonana fanna fo Fick\nFee fy mo Mick, Nick!",
				StringUtils.nameGame("Nick"));
		assertEquals("Ryan", "Ryan!\nRyan, Ryan bo Byan Bonana fanna fo Fyan\nFee fy mo Myan, Ryan!",
				StringUtils.nameGame("Ryan"));
	} //testNameGame
	 
	 } //StringUtilsTest
