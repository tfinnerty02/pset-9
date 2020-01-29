import java.util.ArrayList;
import java.util.Collections;

public class Exercises {

	public static void main(String[] args) {
		System.out.println("p");
	}

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}

		return false;
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n < 1) {
			return null;
		}

		// write your code here
		ArrayList<String> result = new ArrayList<String>();
		result.add("H");
//		for (int i = 0; i < n; i++) {
//			result.add(values.get(i));
//		}
//		for (int j = values.size() - n; j < values.size(); j++) {
//			result.add(values.get(j));
//		}

		return result;
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		// write your code here
		return Collections.max(numbers) - Collections.min(numbers);

	}

	public double biggest(ArrayList<Double> numbers) {
		// write your code here

		return -1; // default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here

		return null; // default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false; // default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1; // default return value to ensure compilation
	}
}
