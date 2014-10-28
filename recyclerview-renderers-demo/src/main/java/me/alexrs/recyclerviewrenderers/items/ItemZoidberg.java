package me.alexrs.recyclerviewrenderers.items;

import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class ItemZoidberg implements Renderable {

    private String title;

    public ItemZoidberg(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getRenderableId() {
        return R.layout.item_zoidberg;
    }
}
