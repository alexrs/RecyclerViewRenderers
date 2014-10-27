package me.alexrs.bender.demo.renderers;

import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.alexrs.bender.demo.viewholder.ViewHolderFry;
import me.alexrs.bender.lib.renderer.Renderer;
import me.alexrs.bender.lib.viewholder.RenderViewHolder;

/**
 * @author Alejandro on 27/10/14.
 */
public class ItemFryRenderer extends Renderer {

    public ItemFryRenderer(int id) {
        super(id);
    }

    @Override
    public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, @LayoutRes int id) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        ViewHolderFry viewHolder = new ViewHolderFry(itemView);
        return viewHolder;
    }
}
