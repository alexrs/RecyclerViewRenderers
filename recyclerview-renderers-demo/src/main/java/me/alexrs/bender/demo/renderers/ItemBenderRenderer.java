package me.alexrs.bender.demo.renderers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.alexrs.bender.demo.viewholder.ViewHolderBender;
import me.alexrs.bender.lib.renderer.Renderer;
import me.alexrs.bender.lib.viewholder.RenderViewHolder;

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
        ViewHolderBender viewHolder = new ViewHolderBender(itemView);
        return viewHolder;
    }
}