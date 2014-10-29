package me.alexrs.recyclerviewrenderers.builder;

import android.support.annotation.LayoutRes;

import me.alexrs.recyclerviewrenderers.interfaces.Builder;
import me.alexrs.recyclerviewrenderers.interfaces.RendererFactory;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;

/**
 * @author Alejandro Rodrigiez <https://github.com/Alexrs95>
 *         <p/>
 *         Builder that return the Renderer to display
 */
public class RendererBuilder implements Builder {

    /**
     * Factory that provide the Renderer
     */
    private RendererFactory factory;

    /**
     * id of the layout
     */
    @LayoutRes
    private int id;

    public RendererBuilder(RendererFactory factory) {
        this.factory = factory;
    }

    @Override
    public Renderer create() {
        return factory.getRenderer(id);
    }

    @Override
    public Builder instantiate(@LayoutRes int id) {
        this.id = id;
        return this;
    }

}
