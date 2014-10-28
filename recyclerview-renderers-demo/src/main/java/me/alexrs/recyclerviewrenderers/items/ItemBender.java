package me.alexrs.recyclerviewrenderers.items;

import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

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
    public int getRenderableId() {
        return R.layout.item_bender;
    }
}
