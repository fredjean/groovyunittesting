/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coercion

import org.junit.Test
import coercion.NurseryRhyme

import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.*

class NurseryRhymeTest {
	@Test void noCoercionHere() {
        def rhyme = new NurseryRhyme()
        assert rhyme.sing() == "Mary had a little lamb."
    }

    @Test void kidWantsTheLondonBridge() {
        def rhyme = [ getLyrics : { -> "London bridge is coming down."}] as NurseryRhyme
        assert rhyme.sing() == "London bridge is coming down." : "Coercion failed."
    }

    @Test void hamcrestMatchers() {
        def rhyme = [ getLyrics : { -> "The cow jumped over the moon"}] as NurseryRhyme
        assertThat "Lyrics are not working", rhyme.sing(), is("The cow jumped over the moon")
    }
}

