package edu.gatech.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {

	private MyStringInterface mystring;

	@Before
	public void setUp() throws Exception {
		mystring = new MyString();
	}

	@After
	public void tearDown() throws Exception {
		mystring = null;
	}

	@Test
	public void testGetConsonants1() {
		mystring.setString("I like vowels better than consonants");
		assertEquals("lkvwlsbttrthncnsnnts", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants2() {
       mystring.setString("aeiou");
       assertEquals("", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants3() {
	       mystring.setString("Marius is very scary");
	       assertEquals("mrssvryscry", mystring.getConsonants());
		}

	@Test
	public void testGetConsonants4() {
		 mystring.setString("Marius is very scary");
	       assertNotNull("Mrssvryscry", mystring.getConsonants());
	}

	@Test
	public void testNumberOfConsonants1() {
		mystring.setString("I like vowels better than consonants");
		assertEquals(20, mystring.numberOfConsonants());
	}

	@Test
	public void testNumberOfConsonants2() {
		mystring.setString("Marius");
		int total = mystring.numberOfConsonants()+2;
	       assertEquals(5, total);
	}

	@Test(expected = ArithmeticException.class)
	public void testNumberOfConsonants3() {
		mystring.setString("Marius");
		int total = mystring.numberOfConsonants()/0;
		System.out.print(total);
	       
	       
	}

	@Test
	public void testNumberOfConsonants4() {
		mystring.setString("Marius");
		int total = mystring.numberOfConsonants()-99;
		int total2 = total+96;
	       assertEquals(0, total2);
	}

	@Test
	public void testGetCharacter1() {
		mystring.setString("I like vowels better than consonants");
		assertEquals('e', mystring.getCharacter(16));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGetCharacter2() {
       mystring.setString("Marius");
       mystring.getCharacter(8);
	}

	@Test
	public void testGetCharacter3() {
		 mystring.setString("Marius is the greatest");
	       assertSame('m',mystring.getCharacter(1));
	       
	}

	@Test
	public void testGetCharacter4() {
		 mystring.setString("Marius is the greatest");
	       assertSame('s',mystring.getCharacter(6));
	}

	@Test
	public void testFlipCaseInSubstring1() {
		mystring.setString("I Like Vowels Better Than Consonants");
		mystring.flipCaseInSubstring(7, 21);
		assertEquals("I Like vOWELS bETTER Than Consonants", mystring.getString());	
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testFlipCaseInSubstring2() {
		mystring.setString("Pizza");
		mystring.flipCaseInSubstring(0, 35);
		
	}

	@Test
	public void testFlipCaseInSubstring3() {
		mystring.setString("Pizza");
		mystring.flipCaseInSubstring(0, 1);
		assertEquals("pI", mystring.getString());
	}

	@Test
	public void testFlipCaseInSubstring4() {
		mystring.setString("Pizza");
		mystring.flipCaseInSubstring(0, 2);
		String s = mystring.getString();
		assertEquals(3,s.length());
	}
}
