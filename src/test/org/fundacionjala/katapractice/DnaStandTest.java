package org.fundacionjala.katapractice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link DnaStrand}
 */
public class DnaStandTest {

    @Test
    public void test_makeComplement(){
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}

