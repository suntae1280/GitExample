import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		System.out.println(numbers.add(10));
		System.out.println(numbers.add(20));
		System.out.println(numbers.add(30));
		System.out.println(numbers.add(40));
		System.out.println(numbers.add(10));

		System.out.println(numbers.size());
		System.out.println(numbers.toString());

		System.out.println("------------------------------");

		Set<String> words = new TreeSet<>();

		words.add("banana");
		words.add("apple");
		words.add("tomato");
		words.add("apple");

		System.out.println(words.toString());
		System.out.println("------------------------------");
		Set<String> wordsSet = new LinkedHashSet<>();

		wordsSet.add("banana");
		wordsSet.add("apple");
		wordsSet.add("tomato");
		wordsSet.add("apple");

		System.out.println(wordsSet.toString());

	}

}
