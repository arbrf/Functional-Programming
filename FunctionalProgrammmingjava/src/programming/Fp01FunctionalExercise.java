package programming;

import java.util.List;

public class Fp01FunctionalExercise {
	private static int print(String course) {
		int c=course.length();
		return c;
		
	}

	public static void main(String[] args) {
		List<Integer> numberList = List.of(11, 2, 34, 4, 12, 4, 1, 24, 3, 22);
		List<String> courses = 
		List.of("AWS","DEVOPS","Spring","Spring Boot","AWS","PCF","Cloud","DBMS","Python","Java","Micrsoft","Kubernets","Docker");
		courses.stream().map(course->course+"  "+course.length())
		.forEach(System.out::println);
		printAllOddNumbersInFunctional(numberList);
		printAllSquareNumbersInFunctional(numberList);
		printAllCubeNumbersInFunctional(numberList);

	}

	private static void printAllOddNumbersInFunctional(List<Integer> numberList) {
		numberList.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}
	private static void printAllSquareNumbersInFunctional(List<Integer> numberList) {
		numberList.stream().filter(number -> number % 2 != 0)
		.map(number->number*number*number)
		.forEach(System.out::println);
	}
	private static void printAllCubeNumbersInFunctional(List<Integer> numberList) {
		numberList.stream().filter(number -> number % 2 != 0)
		.map(number->number*number)
		.forEach(System.out::println);
	}

}
