import org.junit.Test
import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.*

@Test void matchers() {
  assertThat "Zero is one", 0, is(not(1))
}