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

		ArrayList<String> result = new ArrayList<String>();
		result.add("H");
		for (int i = 0; i < n; i++) {
			result.add(values.get(i));
		}
		for (int j = values.size() - n; j < values.size(); j++) {
			result.add(values.get(j));
		}

		return result;
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		return Collections.max(numbers) - Collections.min(numbers);

	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() % 2 == 0 || numbers.size() < 3) {
			return -1;
		}
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < 0) {
				return -1;
			}
		}

		ArrayList<Double> result = new ArrayList<Double>();
		result.add(numbers.get(0));
		result.add(numbers.get((numbers.size() - 1) / 2));
		result.add(numbers.get(numbers.size() - 1));

		return Collections.max(result);

	}

	public ArrayList<String> middle(ArrayList<String> values) {
		if (values == null || values.size() % 2 == 0 || values.size() < 3) {
			return null;
		}

		ArrayList<String> result = new ArrayList<String>();
		result.add(values.get((values.size() - 1) / 2 - 1));
		result.add(values.get((values.size() - 1) / 2));
		result.add(values.get((values.size() - 1) / 2 + 1));
		
		return result;
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
