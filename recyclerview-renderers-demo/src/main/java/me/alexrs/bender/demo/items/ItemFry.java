package me.alexrs.bender.demo.items;

import me.alexrs.bender.demo.R;
import me.alexrs.bender.lib.interfaces.Renderable;

/**
 * @author Alejandro on 27/10/14.
 */
public class ItemFry implements Renderable {

    @Override
    public int getBenderableId() {
        return R.layout.item_fry;
    }
}
