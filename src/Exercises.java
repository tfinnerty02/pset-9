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
		ArrayList<String> result = new ArrayList<String>();
		if (values == null || values.size() < n || n < 0 || values.isEmpty()) {
			return result;
		}

		int initialN = n;
		for (int i = 0; i < n; i++) {
			result.add(values.get(i));
		}
		for (int i = n; i < n * 2; i++) {
			result.add(values.get(values.size() - initialN));
			initialN--;
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
		if (values == null || values.size() < 3 || values.size() % 2 == 0 || values.contains(null)) {
			ArrayList<String> emptyList = new ArrayList<String>();
			return emptyList;
		}

		ArrayList<String> result = new ArrayList<String>();
		
		int middleIndex = (values.size() - 1) / 2;
		result.add(values.get(middleIndex - 1));
		result.add(values.get(middleIndex));
		result.add(values.get(middleIndex + 1));
		
		return result;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		for (int i = 0; i <= numbers.size() - 3; i++) {
			if (numbers.get(i) < numbers.get(i + 1) && numbers.get(i + 1) < numbers.get(i + 2)) {
				return true;
			}
		}

		return false;
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1 || (numbers.get(0) != x && numbers.get(1) != x)) {
			return false;
		}

		boolean sameEvens = true;
		boolean sameOdds = true;
		boolean sameMiddle = false;
		for (int i = 0; i < numbers.size(); i += 2) {
			if (numbers.get(i) != x) {
				sameEvens = false;
			}
		}
		for (int i = 1; i < numbers.size(); i += 2) {
			if (numbers.get(i) != x) {
				sameOdds = false;
			}
		}
		if (numbers.size() % 3 == 0 && numbers.get(1) == x) {
			sameMiddle = true;
			int templateMiddle = numbers.get(1);
			for (int i = 1; i < numbers.size(); i += 3) {
				if (numbers.get(i) != templateMiddle) {
					sameMiddle = false;
				}
			}
		}

		if (sameEvens || sameOdds || sameMiddle) {
			return true;
		} else {
			return false;
		}
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		for (int i = 0; i < numbers.size() - 2; i++) {
			if ((numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0 && numbers.get(i + 2) % 2 == 0)
					|| (numbers.get(i) % 2 == 1 && numbers.get(i + 1) % 2 == 1 && numbers.get(i + 2) % 2 == 1)) {
				return true;
			}
		}

		return false;
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) {
			return false;
		}

		for (int i = 0; i < numbers.size() - 1; i++) {
			int firstHalfSum = 0;
			int secondHalfSum = 0;

			for (int j = i; j >= 0; j--) {
				firstHalfSum += numbers.get(j);
			}

			for (int k = i + 1; k < numbers.size(); k++) {
				secondHalfSum += numbers.get(k);
			}

			if (firstHalfSum == secondHalfSum) {
				return true;
			}
		}
		return false;
	}

	public int clumps(ArrayList<String> values) {
		if (values == null) {
			return -1;
		}
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return -1;
			}
		}

		boolean clumps = false;
		int count = 0;
		for (int i = 0; i < values.size() - 1; i++) {
			if (values.get(i).equals(values.get(i + 1)) && !clumps) {
				clumps = true;
				count++;
			} else if (!values.get(i).equals(values.get(i + 1))) {
				clumps = false;
			}
		}

		return count;
	}
}
