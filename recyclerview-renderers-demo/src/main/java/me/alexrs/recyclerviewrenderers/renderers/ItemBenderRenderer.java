package me.alexrs.recyclerviewrenderers.renderers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.alexrs.recyclerviewrenderers.viewholder.ViewHolderBender;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;
import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class ItemBenderRenderer extends Renderer {


    public ItemBenderRenderer(int id) {
        super(id);
    }

    @Override
    public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        return new ViewHolderBender(itemView);
    }
}