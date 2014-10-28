package me.alexrs.recyclerviewrenderers.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public abstract class RenderViewHolder<B extends Renderable> extends RecyclerView.ViewHolder {

    /**
     *
     * @param itemView
     */
    public RenderViewHolder(View itemView) {
        super(itemView);
    }

    /**
     *
     * @param renderable
     */
    public abstract void onBindView(B renderable);

    /**
     *
     */
    public void onViewRecycled() {
    }

    /**
     *
     */
    public void onViewAttachedToWindow() {
    }

    /**
     * 
     */
    public void onViewDetachedFromWindow() {

    }
}
