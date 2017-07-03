package test.example.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import example.easy.Palindrome;

public class TestPalindrome {

	@Test
	public void test() {
		assertEquals(Palindrome.findNumberAtPosition(987654321, 1), 1);
		assertEquals(Palindrome.findNumberAtPosition(987654321, 2), 2);
		assertEquals(Palindrome.findNumberAtPosition(987654321, 3), 3);
		assertEquals(Palindrome.findNumberAtPosition(987654321, 8), 8);
	}

}
