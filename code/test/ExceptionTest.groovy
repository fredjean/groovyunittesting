import org.junit.Test

@Test(expected=IllegalArgumentException.class)
void shouldThrowException() {
  throw new IllegalArgumentException("Blah")
}