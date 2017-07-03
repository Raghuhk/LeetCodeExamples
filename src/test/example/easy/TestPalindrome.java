package test.example.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import example.easy.Palindrome;

public class TestPalindrome {

		
	@Test
	public void testFindLengthOfInt(){
		assertEquals(1, Palindrome.findLengthOfInt(2));
		assertEquals(5,Palindrome.findLengthOfInt(34643));
		assertEquals(7,Palindrome.findLengthOfInt(-4534643));
	}
	
	@Test
	public void testFindNumberAtPosition(){
		assertEquals(5, Palindrome.findNumberAtPosition(87654321,5));
		assertEquals(8, Palindrome.findNumberAtPosition(87654321,8));
		assertEquals(1, Palindrome.findNumberAtPosition(87654321,1));
		
	}
	
	@Test
	public void testPalindrome(){
		assertEquals(true,Palindrome.revisedIsPalindrome(123321));
		assertEquals(false,Palindrome.revisedIsPalindrome(12345321));
	}
	
	@Test
	public void testPalindromeWithHints(){
		//assertEquals(true,Palindrome.isPalindromeWithHints(123321));
		assertEquals(true,Palindrome.isPalindromeWithHints(1410110141));
		//assertEquals(false,Palindrome.isPalindromeWithHints(12345321));
	}

}
