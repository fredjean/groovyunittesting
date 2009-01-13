// START:p1
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasicTest { 
   @Test public void helloWorld() { 
      assertEquals("The answer should be 42", 42, 40 + 2);
   } 
}
// END:p1
// START:p2
import org.junit.Test
import static org.junit.Assert.assertEquals

class BasicTest { 
   @Test void helloWorld() { 
      assertEquals("The answer should be 42", 42, 40 + 2)
   } 
}
// END:p2
// START:p3
import org.junit.Test

class BasicTest { 
   @Test void helloWorld() { 
      assert 42 == 40 + 2 : "The answer should be 42"
   } 
}
// END:p3
// START:p4
import org.junit.Test

@Test void helloWorld() { 
    assert 42 == 40 + 2 : "The answer should be 42"
}
// END:p4
