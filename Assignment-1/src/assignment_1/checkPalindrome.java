package assignment_1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class checkPalindrome {
	 public static void main(String[ ] args)
	   {
		Scanner stdin = new Scanner(System.in);       
		String line;                           
	      
	      do
	      {
		 System.out.print("Enter Number, Phrase or a String:");
	     line = stdin.nextLine();
	     if (is_palindrome(line))
		    System.out.println("That is a palindrome.");
		 else
		    System.out.println("That is not a palindrome.");
	      }
	      while (line.length( ) != 0);
	   }

	   public static boolean is_palindrome(String temp) 
	   {  
		  String input  =  temp.toLowerCase().replaceAll("\\s","");
	      Queue<Character> q = new LinkedList<Character>( );
	      Stack<Character> s = new Stack<Character>( );
	      Character letter;   
	      int mismatches = 0; 
	      int i;           
	      for (i = 0; i < input.length( ); i++)
	      {
		    letter = input.charAt(i);
	         if (Character.isLetter(letter)|| Character.isDigit(letter))
	         {
	            q.add(letter);
	            s.push(letter);
	         }
	         else
	         {
	        	 return false;
	         }
	        
	      }
	      
	      while (!q.isEmpty( ))
	      {
	         if (q.remove( ) != s.pop( ))
	            mismatches++;
	      }

	      return (mismatches == 0); 
	   }
}
