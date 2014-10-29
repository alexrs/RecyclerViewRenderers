package me.alexrs.recyclerviewrenderers.factory;

import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.interfaces.RendererFactory;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;
import me.alexrs.recyclerviewrenderers.renderers.ItemBenderRenderer;
import me.alexrs.recyclerviewrenderers.renderers.ItemFryRenderer;
import me.alexrs.recyclerviewrenderers.renderers.ItemZoidbergRenderer;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class Factory implements RendererFactory {

    @Override
    public Renderer getRenderer(int id) {
        switch (id) {
            case R.layout.item_bender:
                return new ItemBenderRenderer(id);
            case R.layout.item_zoidberg:
                return new ItemZoidbergRenderer(id);
            case R.layout.item_fry:
                return new ItemFryRenderer(id);
        }
        return null;
    }
}
