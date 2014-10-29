package me.alexrs.recyclerviewrenderers.interfaces;

import android.support.annotation.LayoutRes;

import me.alexrs.recyclerviewrenderers.renderer.Renderer;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 *         <p/>
 *         Interface that defines the implementation of the factory that return the renderer
 */
public interface RendererFactory {

    /**
     * @param id the ID of the layout
     * @return the Renderer assigned to the layout
     */
    Renderer getRenderer(@LayoutRes int id);
}
