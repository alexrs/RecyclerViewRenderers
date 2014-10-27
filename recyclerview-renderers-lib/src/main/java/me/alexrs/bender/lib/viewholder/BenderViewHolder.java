package me.alexrs.bender.lib.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import me.alexrs.bender.lib.interfaces.Renderable;

/**
 * @author Alejandro on 20/10/14.
 */
public abstract class BenderViewHolder<B extends Renderable> extends RecyclerView.ViewHolder {

    public BenderViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBindView(B renderable);

    public void onViewRecycled() {
    }

    public void onViewAttachedToWindow() {
    }

    public void onViewDetachedFromWindow() {

    }
}
