package exceptionPackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConPreSupDemo{


	
	public static void main(String[] args) {
		 List<Integer> list= Arrays.asList(2,8,7,9,5,6,6,45,5);

		// CONSUMER
		 Consumer<Integer> consumer= (t)->{System.out.println("check output "+ t/2);};
		 
		 consumer.accept(50);
		 list.stream().forEach(consumer);
		
		
		// PERICATE
		
		//Predicate<Integer> preicate= (t)->(t%2==0);
		list.stream().filter(t->t%2==0).forEach(t->System.out.println("print "+ t));
		
		//SUPPLIER
		
		//Supplier<String>supplier= ()->{return "Hello Javaa";};
		List<String> list1= Arrays.asList();
		
		System.out.println(list1.stream().findAny().orElseGet(()->"Hello java"));
		
	}

	
}
