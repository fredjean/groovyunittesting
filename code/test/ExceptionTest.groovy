// START:expected
import org.junit.Test

@Test(expected=IllegalArgumentException.class)
void shouldThrowException() {
  throw new IllegalArgumentException("Blah")
}
// END:expected
// START:fail
import org.junit.Test

@Test void shouldThrowException() {
  try {
      throw new IllegalArgumentException("Blah")
      fail "An Exception should have occured" 
  } catch (IllegalArgumentException iae) {
    // NOP
  } catch (Exception e) {
    fail "Expecting an IllegalArgumentException"
  }
}
// END:fail