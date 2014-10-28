package me.alexrs.recyclerviewrenderers.renderer;

import android.support.annotation.LayoutRes;
import android.view.ViewGroup;

import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public abstract class Renderer {

    /**
     *
     */
    @LayoutRes
    public final int id;

    protected Renderer(@LayoutRes int id) {
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
    @LayoutRes
    public int getId() {
        return id;
    }
}
