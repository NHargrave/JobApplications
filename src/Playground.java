import java.util.ArrayList;
import java.util.List;

/*Palindrome:  Write a function that accepts a string parameter, and returns true if that parameter is a palindrome 
o Spelled the same backwards and forwards (https://en.wikipedia.org/wiki/Palindrome)
o Run the palindrome function 4 times:
•	With inputs:
•	racecar, anna, speed, code
•	With outputs:
•	racecar => true
•	anna => true
•	speed => false
•	code => false
*/

/*
 * Fibonacci:  Write a function that returns the first 60 values in a Fibonacci sequence (as a list of numbers)
o First number is 0, second number is 1.  Everything else is the sum of the previous two numbers
o 0, 1, 1, 2, 3, 5, 8, 13, … (https://en.wikipedia.org/wiki/Fibonacci_number)
 */

class Playground {
	public static void main(String args[]) {
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("anna"));
		System.out.println(isPalindrome("speed"));
		System.out.println(isPalindrome("code"));

		int n = 2;
		System.out.println(n + " indexes of fibonacci = " + fibonacci(n));
	}

	static boolean isPalindrome(String input) {
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	static ArrayList<Long> fibonacci(int n) {
		ArrayList<Long> fibs = new ArrayList<Long>();
		fibs.add((long) 0);
		fibs.add((long) 1);
		long next;
		if (n > 2) {
			for (int i = 0; i < n - 2; i++) {
				next = fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2);
				fibs.add(next);
			}
		}
		return fibs;
	}
}