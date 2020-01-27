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

    public static double sheppeyToMiles(double sheppey) {return sheppey * 7/8;
    }

    public static double milesToSheppey(double miles) {return miles * 8/7;
    }
    public static double DonkeypowerToWatts(double donkeypower){return donkeypower * 250;
    }
    public static double WattstoDonkeypower(double Watts){return Watts / 250;}
}
