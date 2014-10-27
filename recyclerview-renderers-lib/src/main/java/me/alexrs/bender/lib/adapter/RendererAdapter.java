package me.alexrs.bender.lib.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import me.alexrs.bender.lib.renderer.Renderer;
import me.alexrs.bender.lib.builder.RendererBuilder;
import me.alexrs.bender.lib.interfaces.Renderable;
import me.alexrs.bender.lib.interfaces.Builder;
import me.alexrs.bender.lib.viewholder.BenderViewHolder;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class RendererAdapter extends RecyclerView.Adapter<BenderViewHolder> {

    /**
     * Adapter data
     */
    private List<Renderable> data;

    /**
     * Builder to instantiate the Benderer
     */
    private Builder builder;

    /**
     * Benderer to show
     */
    private Renderer renderer;

    public RendererAdapter(List<Renderable> data, RendererBuilder builder) {
        this.data = data;
        if (data == null) {
            throw new IllegalArgumentException("Data must not be null");
        }

        this.builder = builder;
        if (builder == null) {
            throw new IllegalArgumentException("Builder must not be null");
        }
    }

    @Override
    public BenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        renderer = builder.instantiate(viewType).create();
        return renderer.onCreateViewHolder(viewGroup, viewType);
    }

    @Override
    public void onBindViewHolder(BenderViewHolder holder, int position) {
        holder.onBindView(data.get(position));
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onViewRecycled(BenderViewHolder holder) {
        super.onViewRecycled(holder);
        holder.onViewRecycled();
    }

    @Override
    public void onViewAttachedToWindow(BenderViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedToWindow();
    }

    @Override
    public void onViewDetachedFromWindow(BenderViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getBenderableId();
    }

}