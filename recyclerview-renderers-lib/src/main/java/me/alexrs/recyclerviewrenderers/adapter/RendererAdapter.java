/*
 * Copyright (C) 2014 Alejandro Rodriguez Salamanca.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.alexrs.recyclerviewrenderers.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import me.alexrs.recyclerviewrenderers.builder.RendererBuilder;
import me.alexrs.recyclerviewrenderers.interfaces.Builder;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;
import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 *         <p/>
 *         Adapter created to manage the Renderers. This is the main class of this library.
 *         The main objective of this class is to avoid creating new adapters for each type of data
 *         we want to show in our RecyclerViews. Also, this adapter allows to display different
 *         elements with different data that exexute different actions.
 */
public class RendererAdapter extends RecyclerView.Adapter<RenderViewHolder> {

    /**
     * List containing the renderables
     */
    private List<Renderable> data;

    /**
     * Builder to instantiate the Renderer
     */
    private Builder builder;

    /**
     * @param data    List that contains the data to show
     * @param builder Builder that create the Renderers
     */
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
    public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Renderer renderer = builder.instantiate(viewType).create();
        return renderer.onCreateViewHolder(viewGroup, viewType);
    }

    @Override
    public void onBindViewHolder(RenderViewHolder holder, int position) {
        holder.onBindView(data.get(position));
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onViewRecycled(RenderViewHolder holder) {
        super.onViewRecycled(holder);
        holder.onViewRecycled();
    }

    @Override
    public void onViewAttachedToWindow(RenderViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedToWindow();
    }

    @Override
    public void onViewDetachedFromWindow(RenderViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getRenderableId();
    }

}