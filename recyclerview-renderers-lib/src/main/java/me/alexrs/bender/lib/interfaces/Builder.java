package me.alexrs.bender.lib.interfaces;

import me.alexrs.bender.lib.renderer.Renderer;

/**
 * @author Alejandro on 30/08/14.
 */
public interface Builder {

    /**
     * @param id the ID of the layout
     * @return an instance of the builder
     */
    Builder instantiate(int id);

    /**
     * @return the Benderer assigned to the layout
     */
    Renderer create();

}
