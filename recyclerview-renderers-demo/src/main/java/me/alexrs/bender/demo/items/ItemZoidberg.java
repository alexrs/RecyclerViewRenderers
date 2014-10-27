package me.alexrs.bender.demo.items;

import me.alexrs.bender.demo.R;
import me.alexrs.bender.lib.interfaces.Renderable;

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
    public int getBenderableId() {
        return R.layout.item_zoidberg;
    }
}
