package assignment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPalindromeTest {

	@Test
	public void checkNumberCase1() {
		boolean result = checkPalindrome.is_palindrome("11111");
		assertEquals(true, result);
		}
	
	@Test
	public void checkNumberCase2() {
		boolean result = checkPalindrome.is_palindrome("12345");
		assertEquals(false, result);
		}
	
	@Test
	public void checkString() {
		boolean result = checkPalindrome.is_palindrome("civic");
		assertEquals(true, result);
		}
	
	@Test
	public void checkPhrase() {
		boolean result = checkPalindrome.is_palindrome("aaa Aaa AaaAa");
		assertEquals(true, result);
		}
	
	@Test
	public void capitalization() {
		boolean result = checkPalindrome.is_palindrome("Civic");
		assertEquals(true, result);
		}
	
	@Test
	public void whiteSpaces() {
		boolean result = checkPalindrome.is_palindrome("Ci vic");
		assertTrue(result);
		}
	
	@Test
	public void punctuations() {
		boolean result = checkPalindrome.is_palindrome(";;");
		assertEquals(false, result);
		}
	
	@Test
	public void emptyString() {
		boolean result = checkPalindrome.is_palindrome("");
		assertEquals(true, result);
		}
	
	 @Test (expected= NullPointerException.class)
	 public void testExceptions() throws Exception {
	        String str = null;
	        checkPalindrome.is_palindrome(str);
	    }
	 
	 
	}
