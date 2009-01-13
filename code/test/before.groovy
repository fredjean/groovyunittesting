// START:before
import org.junit.Before

@Before void setupTest() {
    label = new TestMastheadLabel()
}
// END:before
// START:after
import org.junit.After

@After void afterTest() {
  label = null
}
// END:after
// START:beforeclass
import org.junit.BeforeClass

@BeforeClass void startSelenium() {
  selenium = new DefaultSelenium()
  selenium.start()
}
// END:beforeclass
// START:afterclass
import org.junit.AfterClass

@AfterClass void stopSelenium() {
  selenium.stop()
}
// END:afterclass