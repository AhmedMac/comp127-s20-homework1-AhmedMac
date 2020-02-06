package edu.macalester.comp127.hw1;

/**
 * Unit Conversions for humorous units of measurement.
 *
 * Original Author: Bret Jackson
 *
 * Acknowledgements:
 *   The Sheppy unit can be found on:
 *   https://en.wikipedia.org/wiki/List_of_humorous_units_of_measurement#Sheppey
 *
 *   The original idea for this assignment was by Paul Cantrell.
 *   Bret Jackson converted to the Sheppy, and Libby Shoop added this header.
 *
 */
public class UnitConversions {

    /** This method converts Sheppy into Miles */
    public static double sheppeyToMiles(double sheppey) {
        return (double) 7 / 8 * sheppey;
    }
    /** This method converts Miles into Sheppy */
    public static double milesToSheppey(double miles) {
        return (double) 8 / 7 * miles;
    }
    /** This method converts DonkeyPower into Watts */
    public static double donkeyPowerToWatts (double donkeyPower){
        return donkeyPower * 250;
    }
    /** This method converts Watts into DonkeyPower */
    public static double wattsToDonkeyPower (double watts){
        return watts / 250;
    }
}
