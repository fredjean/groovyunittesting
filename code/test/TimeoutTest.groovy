import org.junit.Test

@Test(timeout=10000) void shouldTimeout() {
  while (true) { }
}