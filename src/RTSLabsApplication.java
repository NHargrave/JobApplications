import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/*
RTS Labs Senior Back-end Developer Position

Please write a class in the language of your choice that contains the following two public methods:
	1.	aboveBelow
		•	accepts two arguments 
			-	An unsorted collection of integers (the list)
			-	an integer (the comparison value)
		•	returns a hash/object/map/etc. with the keys "above" and "below" with the corresponding count of integers from the list that are above or below the comparison value
	Example usage:
	input: [1, 5, 2, 1, 10], 6
	output: { "above": 1, "below": 4 }

2.	stringRotation
	•	accepts two arguments
		-	a string (the original string)
		-	a positive integer (the rotation amount)
	•	returns a new string, rotating the characters in the original string to the right by the rotation amount and have the overflow appear at the beginning
	Example usage:
	input: "MyString", 2
	output: "ngMyStri"

*/

class RTSLabsApplication {
	public static void main(String args[]) {
		RTSLabsApplication tester = new RTSLabsApplication();
		
		// Test aboveBelow
		List<Integer> intList = Arrays.asList(1, 5, 2, 6, 12, 34, 11, 100);
		int comparisonValue = 3;

		System.out.println("Testing aboveBelow");
		System.out.println("------------------");
		System.out.println("input: " + intList + ", " + comparisonValue);
		System.out.println("output: " + tester.aboveBelow(intList, comparisonValue));

		// Test stringRotation
		String input = "MyString";
		int rotation = 9;
		
		System.out.println("\nTesting stringRotation");
		System.out.println("----------------------");
		System.out.println("input: " + input + ", " + rotation);
		System.out.println("output: " + tester.stringRotation(input, rotation));
	}

	// return counts of numbers in a list above/below a given number
	// what to do with equal numbers?
	public HashMap<String, Integer> aboveBelow(Collection<Integer> intList, int theBar) {
		HashMap<String, Integer> aboveBelowCounts = new HashMap<String, Integer>();
		int above = 0, below = 0;

		for (int num : intList) {
			if (num > theBar)
				above++;
			else if (num < theBar)
				below++;
		}

		aboveBelowCounts.put("above", above);
		aboveBelowCounts.put("below", below);

		return aboveBelowCounts;
	}

	public String stringRotation(String input, int rotator) {
		// Protect against rotations larger than input String
		rotator = rotator % input.length();
		// Cheating a little - turning this into equivalent left rotate
		rotator = input.length() - rotator;
		
		return input.substring(rotator) + input.substring(0, rotator);
	}
}