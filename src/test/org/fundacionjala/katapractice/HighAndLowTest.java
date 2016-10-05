package org.fundacionjala.katapractice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link HighAndLow}
 */
public class HighAndLowTest {
    
    @Test
    public void test_HighLowValuesCase1(){
        Assert.assertEquals("5 1", HighAndLow.getHighLow("1 2 3 4 5"));
        Assert.assertEquals("5 -3",HighAndLow.getHighLow("1 2 -3 4 5"));
        Assert.assertEquals("9 -5",HighAndLow.getHighLow("1 9 3 4 -5"));

    }

}
