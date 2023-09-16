import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Example<E> {
	
	private E element;
	
	public Example(E ele) {
		this.element = ele;
	}
	
    public String get() {
        return element.toString();
    }
    
    <T> T getTData(T o){
    	return o;
    }
    
    public boolean functionalTest(Predicate<Integer> predicate , int t) {
    	return predicate.test(t);
    }
    
    public static void main(String[] args) {
    	Example<String> example = new Example<>("TEST");
    	System.out.println(example.get());
    	
    	System.out.println(example.functionalTest(x->{
    		return x > 100;
    	}, 100));
    	
    	
    	Predicate<String> predicate1 = a -> {
    		return a.contentEquals("TEST");
    	};
    	Predicate<String> predicate2 = a -> {
    		return a.contentEquals("TEST");
    	};
    	Predicate<String> predicate3 = a -> {
    		return a.contentEquals("TEST");
    	};
    	
    	System.out.println(predicate1.test("TEST"));
    	
    	System.out.println(predicate1.and(predicate2).and(predicate3).test("TEST"));
    	
    	Consumer<String> consumer = x -> {
    		System.out.println("accept data =" + x);
    	};
    	
    	consumer.accept("TEST");
    	
    	Supplier<String> supplier = () -> {
    		return "Random";
    	};
    	
    	System.out.println(supplier.get());
    	
    	Function<String,String> function = f -> {
    		return f + " is function";
    	};
    	
    	System.out.println(function.apply("Hi "));
    	
    	Runnable run = ()->{
    		System.out.println("hi this is runnable");
    	};
    	
    	Callable<String> call = ()->{
    		return "Call dat";
    	};
    	
    	run.run();
    	
    	try {
			System.out.println(call.call());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
}
