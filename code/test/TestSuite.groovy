import org.junit.runner.RunWith
import org.junit.runners.Suite
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
  HelloWorldTest.class,
  BasicScriptTest.class,
  TimeoutTest.class,
  ExceptionTest.class
})
class TestSuite { }