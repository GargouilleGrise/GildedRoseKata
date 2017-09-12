package com.gildedrose.product;

import com.gildedrose.EvolvingItem;

/**
  * An item with specific behavior corresponding to its sellIn value
  * @author Jean-Etienne BOUVET
  * @version 1.0 (2017-09-11)
  **/
public class BackstagePasses extends EvolvingItem {
  public BackstagePasses(int sellIn, int quality) {
    super("Backstage passes", sellIn, quality, 1);
  }
  
  protected void onSellInChange() {
    if(sellIn == 0) {
      setQualityProgression(0);
      setQuality(0);
    } else if(sellIn <= 5) {
      setQualityProgression(3);
    } else if(sellIn <= 10) {
      setQualityProgression(2);
    }
  }
}
