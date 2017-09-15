package com.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgedBrieStrategyTests {

    private AgedBrieStrategy sut;

    @Before
    public void setUp(){
        this.sut = new AgedBrieStrategy();
    }

    @Test
    public void test_agedBrieUpdateQuality(){
        Item item = new Item("name", 1, 43);
        Item actual = sut.updateItem(item);
        Integer expected = 42;
        Assert.assertEquals(actual, expected);
    }

}
