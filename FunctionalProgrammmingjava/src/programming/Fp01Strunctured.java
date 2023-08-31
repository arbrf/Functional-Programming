package programming;

//import java.awt.PageAttributes.PrintQualityType;
import java.lang.foreign.ValueLayout.OfAddress;
import java.util.List;
import java.util.function.Consumer;

public class Fp01Strunctured {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(11, 2, 34, 4, 123, 443, 1, 42, 432, 22);
//		printAllNumbersInStructured(numberList);
		printAllEvenNumbersInStructured(numberList);
		
		

	}

	private static void printAllEvenNumbersInStructured(List<Integer> numberList) {
		for(int number:numberList) {
			if(number%2==0) {
				System.out.println(number);
			}
		}
	
		// TODO Auto-generated method stub
		
	}

	private static void printAllNumbersInStructured(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);/* Method Reference */

	}

}
