package com.gildedrose;

import java.util.ArrayList;

/**
  * Stock of the GildedRose
  * @author Jean-Etienne BOUVET
  * @version 1.0 (2017-09-11)
  **/
class GildedRose {
  /**
    * Use an ArrayList to make add/remove easier
    **/
	private ArrayList<EvolvingItem> items = new ArrayList<>();

	public GildedRose() {
		
	}

  /**
    * Add an item in the stock
    **/
	public void addItem(EvolvingItem item) {
		items.add(item);
	}

  /**
    * Update the stock quality
    **/
	public void updateQuality() {
		for (EvolvingItem item : items) {
			item.updateQuality();
		}
	}
	
  /**
    * Get an item in the stock (not removed)
    **/
	public EvolvingItem getItem(int index) {
		return items.get(index);
	}
	
  /**
    * Pick an item from the stock
    **/
	public EvolvingItem pickUpItem(int index) {
		return items.remove(index);
	}

  /**
    * Returns the stock list as text
    **/
	public String toString() {
		String result = null;
		for(EvolvingItem item : items) {
			result = (result==null ? "" : result + "\n") + item.toString();
		}
		return result;
	}
}