import org.junit.Ignore

@Ignore("Not running because this will fail")
@Test void guaranteedFailure() {
  fail "I told you so!"
}