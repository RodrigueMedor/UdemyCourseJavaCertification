package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TraditionalSearch {
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		print(animals, a-> a.isCanHop());
		System.out.println();
		Consumer<String> comsumer = x -> System.out.println(x);
		print1(comsumer, "Hello World");
		
		Supplier<Integer>  number = () -> 42;
		System.out.println(returnNumber(number));
	}
	private static int returnNumber(Supplier<Integer> supplier) {
		return supplier.get();
	}
	private static void print1(Consumer<String> consumer, String value) {
		consumer.accept(value);
	}
	
	private static void print(List<Animal> animals, CheckTrait checkTrait) {
		animals.stream()
		.filter(a-> checkTrait.test(a))
		.forEach((p)-> System.out.print(p +" "));
		
	}

}
