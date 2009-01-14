import org.junit.Test
import static org.junit.Assume.assumeThat
import static org.junit.Assert.fail
import static org.hamcrest.CoreMatchers.*

@Test void testMyAssumptions() {
    assumeThat File.separatorChar, is('/')
    fail "This would normally fail on Windows"
}