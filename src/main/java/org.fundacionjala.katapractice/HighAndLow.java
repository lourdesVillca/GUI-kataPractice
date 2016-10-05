package org.fundacionjala.katapractice;

import java.util.Arrays;

/**
 * Class to validate high and low number.
 */
public final class HighAndLow {

    /**
     * Private constructor.
     */
    private HighAndLow() {

    }

    /**
     * Method to add get the high and low number.
     *
     * @param values the String that contain the values.
     * @return the result of the calculation that is the high and low number.
     */
    public static String getHighLow(final String values) {
        String[] array = values.split(" ");
        int high = Arrays.asList(array).stream().mapToInt(i -> Integer.parseInt(i)).max().getAsInt();
        int low = Arrays.asList(array).stream().mapToInt(i -> Integer.parseInt(i)).min().getAsInt();
        return String.format("%d %d", high, low);
    }
}
