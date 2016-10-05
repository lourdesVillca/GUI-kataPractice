package org.fundacionjala.katapractice;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Class to validate high and low number.
 */
public class HighAndLow {

    /**
     * Method to add get the high and low number
     *
     * @param values the String that contain the values
     * @return the result of the calculation that is the high and low number.
     */
    public static String getHighLow(final String values) {
        String[] array = values.split(" ");
        IntStream intStream = Arrays.asList(array).stream().mapToInt(i -> Integer.parseInt(i));
        int high = intStream.max().getAsInt();
        int low = intStream.min().getAsInt();
        return String.format("%d %d", high, low);
    }
}
