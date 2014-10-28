package me.alexrs.recyclerviewrenderers.renderers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.alexrs.recyclerviewrenderers.activities.DetailActivity;
import me.alexrs.recyclerviewrenderers.viewholder.ViewHolderZoidberg;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;
import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class ItemZoidbergRenderer extends Renderer implements View.OnClickListener {


    public ItemZoidbergRenderer(int id) {
        super(id);
    }

    @Override
    public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        itemView.setOnClickListener(this);
        return new ViewHolderZoidberg(itemView);
    }


    @Override
    public void onClick(View v) {
        v.getContext().startActivity(new Intent(v.getContext(), DetailActivity.class));
    }
}
