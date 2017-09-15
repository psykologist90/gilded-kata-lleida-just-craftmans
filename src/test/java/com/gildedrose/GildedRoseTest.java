package com.gildedrose;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void test_updateQuality_fakeItem_true() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void test_updateQuality_FullJson(){
        Item[] items = getItemsArray();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Gson gson = new Gson();
        String actual = gson.toJson(items);
        String expected = "[{\"name\":\"+5 Dexterity Vest\",\"sellIn\":9,\"quality\":19},{\"name\":\"Aged Brie\",\"sellIn\":1,\"quality\":1},{\"name\":\"Elixir of the Mongoose\",\"sellIn\":4,\"quality\":6},{\"name\":\"Sulfuras, Hand of Ragnaros\",\"sellIn\":0,\"quality\":80},{\"name\":\"Sulfuras, Hand of Ragnaros\",\"sellIn\":-1,\"quality\":80},{\"name\":\"Backstage passes to a TAFKAL80ETC concert\",\"sellIn\":14,\"quality\":21},{\"name\":\"Backstage passes to a TAFKAL80ETC concert\",\"sellIn\":9,\"quality\":50},{\"name\":\"Backstage passes to a TAFKAL80ETC concert\",\"sellIn\":4,\"quality\":50}]";
        Assert.assertEquals(expected, actual);
    }

    private Item[] getItemsArray() {
        return new Item[] {
                    new Item("+5 Dexterity Vest", 10, 20), //
                    new Item("Aged Brie", 2, 0), //
                    new Item("Elixir of the Mongoose", 5, 7), //
                    new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                    new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                    // this conjured item does not work properly yet
                    };
    }

}
