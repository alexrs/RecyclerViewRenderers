package me.alexrs.bender.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.alexrs.bender.demo.viewholder.ViewHolderBender;
import me.alexrs.bender.lib.renderer.Renderer;
import me.alexrs.bender.lib.viewholder.BenderViewHolder;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class ItemBenderRenderer extends Renderer {


    public ItemBenderRenderer(int id) {
        super(id);
    }

    @Override
    public BenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
        final ViewHolderBender viewHolder;
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        viewHolder = new ViewHolderBender(itemView);
        return viewHolder;
    }
}