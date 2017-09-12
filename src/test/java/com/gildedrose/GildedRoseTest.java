package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        GildedRose app = new GildedRose();
        app.addItem(new EvolvingItem("foo", 0, 0));
        app.updateQuality();
        assertEquals("fixme", app.getItem(0).getName());
    }

}
