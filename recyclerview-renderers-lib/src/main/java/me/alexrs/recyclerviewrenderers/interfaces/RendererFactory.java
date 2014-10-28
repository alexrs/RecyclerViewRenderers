package me.alexrs.recyclerviewrenderers.interfaces;

import me.alexrs.recyclerviewrenderers.renderer.Renderer;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public interface RendererFactory {

    /**
     * @param id the ID of the layout
     * @return the Benderer assigned to the layout
     */
    Renderer getBenderRenderer(int id);
}
