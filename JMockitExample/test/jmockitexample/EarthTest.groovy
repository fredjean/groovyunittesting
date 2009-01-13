/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmockitexample

import org.junit.Test
import org.junit.Before
import mockit.Mockit
import jmockitexample.Planet

class EarthTest {
    @Before void setup() {
        Mockit.redefineMethods(Planet, MockPlanet)
    }

    @Test void changeSkyColor() {
        def planet = new Planet()
        assert planet.theSkyIs() == "red"
    }

    @Test void changeSolarSystem() {
        assert Planet.star() == "Alpha Centuri"
    }
}

