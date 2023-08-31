package programming;

import java.util.List;

public class Fp01Functional {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(11, 2, 34, 4, 123, 443, 1, 42, 432, 22);

		printAllEvenNumbersInFunctional(numberList);

	}

	private static void printAllEvenNumbersInFunctional(List<Integer> numberList) {
		numberList.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}

}
