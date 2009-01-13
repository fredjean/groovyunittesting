/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmockitexample

import org.junit.Test
import org.junit.Before

import mockit.Mockit
import jmockitexample.Sun

/**
 * @author fjean
 */
class SunTest {

    @Before void setup() {
        Mockit.redefineMethods(Sun, MockSun)
    }

    @Test void renameTheSun() {
        def sun = new Sun()
        assert sun.name == "Alpha Centuri"
    }
	
}

