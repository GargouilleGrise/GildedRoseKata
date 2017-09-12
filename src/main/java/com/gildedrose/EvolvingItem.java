package com.gildedrose;

/**
  * Extension of simple item that allows to create item with basic quality behaviors
  * @author Jean-Etienne BOUVET
  * @version 1.0 (2017-09-11)
  **/
public class EvolvingItem extends Item {
  private static final int MIN_QUALITY = 0;
  private static final int MAX_QUALITY = 50;

  private int qualityProgression = -1;

  /**
   * Default item (basic quality behavior)
   **/
  public EvolvingItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  /**
    * Item with a specific quality behavior
    **/
  public EvolvingItem(String name, int sellIn, int quality, int qualityProgression) {
    super(name, sellIn, quality);
    this.qualityProgression = qualityProgression;
  }

  /**
    * Update item quality corresponding to sellIn and quality progression
    **/
  public void updateQuality() {
    if(sellIn > 0) {
      sellIn--;
      onSellInChange();
    }
    applyProgression();
  }
  
  /**
    * Apply the current quality progression
    **/
  private void applyProgression() {
    quality += qualityProgression;
    quality = Math.min(Math.max(quality, MIN_QUALITY), MAX_QUALITY);
  }
  
  /**
    * Called when the sellIn has been decreased
    **/
  protected void onSellInChange() {
    if(sellIn == 0) {
      setQualityProgression(-2);
    }
  }
  
  /**
    * Changes the quality progression
    **/
  final protected void setQualityProgression(int progression) {
    qualityProgression = progression;
  }
  
  /**
    * Set item's quality
    **/
  final protected void setQuality(int quality) {
    this.quality = quality;
  }
  
  /**
    * Returns the item's name
    **/
  final public String getName() {
	  return name;
  }
}