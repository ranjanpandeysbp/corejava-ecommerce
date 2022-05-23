import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple", "Mango", "Grapes");
		
		for(Integer i=0; i<names.size(); i++) {
			names.set(2, "Banana");
		}
		
		System.out.println(names);

	}

}
