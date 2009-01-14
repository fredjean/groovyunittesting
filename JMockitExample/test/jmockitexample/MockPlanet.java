/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jmockitexample;

/**
 *
 * @author fjean
 */
public class MockPlanet {

    public static boolean calledTheSkyIs = false;

    public String theSkyIs() {
        calledTheSkyIs = true;
        return "red";
    }

    public String star() {
        return "Alpha Centuri";
    }
}
