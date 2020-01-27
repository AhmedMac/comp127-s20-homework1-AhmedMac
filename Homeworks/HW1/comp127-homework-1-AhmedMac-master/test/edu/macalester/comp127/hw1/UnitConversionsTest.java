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
    public void testDonkeypowerToWatts(){
        assertEquals(0.0, UnitConversions.DonkeypowerToWatts(0), 0.0001);
        assertEquals(250, UnitConversions.DonkeypowerToWatts(1), 0.0001);
        assertEquals(1000, UnitConversions.DonkeypowerToWatts(4), 0.0001);
        assertEquals(2625, UnitConversions.DonkeypowerToWatts(10.5), 0.0001);
    }
    @Test
    public void WattstoDonkeypower(){
        assertEquals(0.0, UnitConversions.WattstoDonkeypower(0), 0.0001);
        assertEquals(1, UnitConversions.WattstoDonkeypower(250), 0.0001);
        assertEquals(4, UnitConversions.WattstoDonkeypower(1000), 0.0001);
        assertEquals(10.304, UnitConversions.WattstoDonkeypower(2576), 0.0001);
    }


}
