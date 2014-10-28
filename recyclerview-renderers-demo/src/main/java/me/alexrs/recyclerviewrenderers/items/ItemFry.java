package me.alexrs.recyclerviewrenderers.items;

import me.alexrs.bender.demo.R;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

/**
 * @author Alejandro on 27/10/14.
 */
public class ItemFry implements Renderable {

    @Override
    public int getRenderableId() {
        return R.layout.item_fry;
    }
}
