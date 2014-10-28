package me.alexrs.recyclerviewrenderers.builder;

import android.support.annotation.LayoutRes;

import me.alexrs.recyclerviewrenderers.interfaces.Builder;
import me.alexrs.recyclerviewrenderers.interfaces.RendererFactory;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;

/**
 * @author Alejandro Rodrigiez <https://github.com/Alexrs95>
 */
public class RendererBuilder implements Builder {

    /**
     *
     */
    private RendererFactory factory;

    /**
     *
     */
    @LayoutRes
    private int id;

    public RendererBuilder(RendererFactory factory) {
        this.factory = factory;
    }

    @Override
    public Renderer create() {
        return factory.getBenderRenderer(id);
    }

    @Override
    public Builder instantiate(@LayoutRes int id) {
        this.id = id;
        return this;
    }

}
