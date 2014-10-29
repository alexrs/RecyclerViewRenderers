package me.alexrs.recyclerviewrenderers.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

/**
 * @param <R> Renderable that will be received in #onBindViewHolder
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public abstract class RenderViewHolder<R extends Renderable> extends RecyclerView.ViewHolder {

    public RenderViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindView(R renderable);

    public void onViewRecycled() {
    }

    public void onViewAttachedToWindow() {
    }

    public void onViewDetachedFromWindow() {
    }
}
