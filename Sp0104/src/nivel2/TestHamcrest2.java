package nivel2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;


public class TestHamcrest2 {
	public static Matcher<String> length(Matcher<? super Integer> matcher){
	return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length");
		
	}
}
