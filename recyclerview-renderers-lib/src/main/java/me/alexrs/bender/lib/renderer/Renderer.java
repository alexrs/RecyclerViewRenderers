package me.alexrs.bender.lib.renderer;

import android.support.annotation.LayoutRes;
import android.view.ViewGroup;

import me.alexrs.bender.lib.viewholder.RenderViewHolder;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public abstract class Renderer {

    public final int id;

    protected Renderer(int id) {
        this.id = id;
    }

    /**
     * Creates the ViewHolder of the Benderer
     *
     * @param viewGroup the container
     * @return an instance of the ViewHolder
     */
   public abstract RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, @LayoutRes int id);

    /**
     * @return the ID of the layout
     */
    public int getId() {
        return id;
    }
}
