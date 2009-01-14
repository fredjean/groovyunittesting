import org.junit.Ignore
import static org.junit.Assert.fail

@Ignore("Not running because this will fail")
@Test void guaranteedFailure() {
  fail "I told you so!"
}