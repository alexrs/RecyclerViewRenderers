package me.alexrs.bender.lib.interfaces;

import me.alexrs.bender.lib.renderer.Renderer;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public interface RendererFactory {

    /**
     * @param id the ID of the layout
     * @return the Benderer assigned to the layout
     */
    Renderer getBenderRenderer(int id);
}
