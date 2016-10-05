package org.fundacionjala.katapractice;

/**
 * Class to operate with dna.
 */
public final class DnaStrand {

    /**
     * Private constructor.
     */
    private DnaStrand() {

    }

    /**
     * This method to make the complements given a dna.
     *
     * @param dna the dna to be complement.
     * @return the complemented dna.
     */
    public static String makeComplement(final String dna) {
        final String result = dna.replaceAll("A", "t").replaceAll("C", "g").replaceAll("T", "a").replaceAll("G", "c");
        return result.toUpperCase();
    }
}
