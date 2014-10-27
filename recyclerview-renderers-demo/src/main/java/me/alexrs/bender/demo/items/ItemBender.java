package me.alexrs.bender.demo.items;

import me.alexrs.bender.demo.R;
import me.alexrs.bender.lib.interfaces.Renderable;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class ItemBender implements Renderable {

    private String title;

    private String summary;

    public ItemBender(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public int getBenderableId() {
        return R.layout.item_bender;
    }
}
