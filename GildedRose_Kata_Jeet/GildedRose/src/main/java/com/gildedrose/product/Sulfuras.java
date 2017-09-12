package com.gildedrose.product;

import com.gildedrose.EvolvingItem;

/**
  * Legendary item with a great quality that does not change in the time
  * @author Jean-Etienne BOUVET
  * @version 1.0 (2017-09-11)
  **/
public class Sulfuras extends EvolvingItem {
  public Sulfuras() {
    super("Sulfuras, Hand of Ragnaros", 0, 80, 0);
  }

  public void updateQuality() {
	  // Nothing to d here
  }
}