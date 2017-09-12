package com.gildedrose.product;

import com.gildedrose.EvolvingItem;

/**
  * An item with a quality evolving quicker than basic one
  * @author Jean-Etienne BOUVET
  * @version 1.0 (2017-09-11)
  **/
public class Conjured extends EvolvingItem {
  public Conjured(int sellIn, int quality) {
    super("Conjured Mana Cake", sellIn, quality, -2);
  }

  protected void onSellInChange() {
    if(sellIn == 0) {
      setQualityProgression(-4);
    }
  }
}