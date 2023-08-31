package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		List<String> fruitStrings=List.of("Apple","Banan","Chiku","Drum Stick");
		Predicate<? super String> predicate=fruit->fruit.startsWith("B");
		Optional<String> optional = fruitStrings.stream().filter(predicate).findFirst();
		// TODO Auto-generated method stub
		System.out.println(optional);
		System.out.println(optional.get());
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());

	}

}
