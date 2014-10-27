package me.alexrs.bender.demo;

import me.alexrs.bender.lib.renderer.Renderer;
import me.alexrs.bender.lib.interfaces.RendererFactory;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class Factory implements RendererFactory {

    @Override
    public Renderer getBenderRenderer(int id) {
        switch (id) {
            case R.layout.item_bender:
                return new ItemBenderRenderer(id);
            case R.layout.item_zoidberg:
                return new ItemZoidbergRenderer(id);
        }
        return null;
    }
}
