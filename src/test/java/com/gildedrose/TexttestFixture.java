package com.gildedrose;

import com.gildedrose.product.AgedBrie;
import com.gildedrose.product.BackstagePasses;
import com.gildedrose.product.Conjured;
import com.gildedrose.product.Sulfuras;

public class TexttestFixture {
	public static void main(String[] args) {
		System.out.println("OMGHAI!");

		GildedRose app = new GildedRose();

    // Create items and add them to the stock
		app.addItem( new EvolvingItem("+5 Dexterity Vest", 10, 20) );
		app.addItem( new AgedBrie(2, 0) );
		app.addItem( new EvolvingItem("Elixir of the Mongoose", 5, 7) );
		app.addItem( new Sulfuras() );
		app.addItem( new Sulfuras() );
		app.addItem( new BackstagePasses(15, 20) );
		app.addItem( new BackstagePasses(10, 49) );
		app.addItem( new BackstagePasses(5, 49) );
		app.addItem( new Conjured(3, 6) );

    // Schedule 5 days to live
		int days = 5;
		if (args.length > 0) {
			days = Integer.parseInt(args[0]) + 1;
		}

    // Spends all days in the loop and displays results
		for (int i = 0; i < days; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.println("name, sellIn, quality");
			System.out.println(app);
			System.out.println();
			app.updateQuality();
		}
	}
}
