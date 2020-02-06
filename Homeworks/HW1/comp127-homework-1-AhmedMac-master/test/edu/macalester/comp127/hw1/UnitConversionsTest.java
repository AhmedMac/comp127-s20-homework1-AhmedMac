package edu.macalester.comp127.hw1;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitConversionsTest {
    @Test
    public void testSheppeyToMiles() {
        assertEquals(28.0, UnitConversions.sheppeyToMiles(32), 0.00001);
        assertEquals(86.2749999, UnitConversions.sheppeyToMiles( 98.6), 0.00001);
        assertEquals(185.5, UnitConversions.sheppeyToMiles(212), 0.00001);
        assertEquals(100, UnitConversions.sheppeyToMiles(114.285714), 0.00001);
    }

    @Test
    public void testMilesToSheppy() {
        assertEquals(0.0, UnitConversions.milesToSheppey(0), 0.00001);
        assertEquals(42.285714, UnitConversions.milesToSheppey(37), 0.00001);
        assertEquals(114.285714, UnitConversions.milesToSheppey(100), 0.00001);
        assertEquals(212, UnitConversions.milesToSheppey(185.5), 0.00001);
    }

    @Test
    public void testDonkeyPowerToWatts(){
        assertEquals(250, UnitConversions.donkeyPowerToWatts(1.0), 0.0001);
        assertEquals(1000, UnitConversions.donkeyPowerToWatts(4.0), 0.0001);
        assertEquals(9375, UnitConversions.donkeyPowerToWatts(37.5), 0.0001);
        assertEquals(27432.5, UnitConversions.donkeyPowerToWatts(109.73), 0.0001);
    }

    @Test
    public void testWattsToDonkeyPower(){
        assertEquals(1.0, UnitConversions.wattsToDonkeyPower(250), 0.0001);
        assertEquals(4.944, UnitConversions.wattsToDonkeyPower(1236), 0.0001);
        assertEquals(3.56, UnitConversions.wattsToDonkeyPower(890), 0.0001);
        assertEquals(291.668, UnitConversions.wattsToDonkeyPower(72917), 0.0001);
    }


}
