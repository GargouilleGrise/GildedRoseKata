package com.gildedrose.product;

import com.gildedrose.EvolvingItem;

/**
  * An item with quality increasing with the time
  * @author Jean-Etienne BOUVET
  * @version 1.0 (2017-09-11)
  **/
public class AgedBrie extends EvolvingItem {
  public AgedBrie(int sellIn, int quality) {
    super("Aged Brie", sellIn, quality, 1);
  }

  protected void onSellInChange() {
  }
}