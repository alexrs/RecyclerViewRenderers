package me.alexrs.bender.lib.builder;

import me.alexrs.bender.lib.renderer.Renderer;
import me.alexrs.bender.lib.interfaces.RendererFactory;
import me.alexrs.bender.lib.interfaces.Builder;

/**
 * @author Alejandro Rodrigiez <alexrs95@gmail.com>
 *
 */
public class RendererBuilder implements Builder {

    private RendererFactory factory;
    private int id;

    public RendererBuilder(RendererFactory factory) {
        this.factory = factory;
    }

    @Override
    public Renderer create() {
        return factory.getBenderRenderer(id);
    }

    @Override
    public Builder instantiate(int id) {
        this.id = id;
        return this;
    }

}
