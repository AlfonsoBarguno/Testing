package nivel2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;



public class TestHamcrest {
	@Test
	public void unTranviaLlamadoDeseo11() {
	    assertThat("MarlonBrando", length(is(12)));
	}
	public static  Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	          return actual.length();
	        }
	    };
	}
}
