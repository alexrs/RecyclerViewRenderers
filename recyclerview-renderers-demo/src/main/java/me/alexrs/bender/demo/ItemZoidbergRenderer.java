package me.alexrs.bender.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import me.alexrs.bender.demo.viewholder.ViewHolderZoidberg;
import me.alexrs.bender.lib.renderer.Renderer;
import me.alexrs.bender.lib.viewholder.BenderViewHolder;

/**
 * @author Alejandro Rodriguez <alexrs95@gmail.com>
 */
public class ItemZoidbergRenderer extends Renderer implements View.OnClickListener {


    protected ItemZoidbergRenderer(int id) {
        super(id);
    }

    @Override
    public BenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
        final ViewHolderZoidberg viewHolder;
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        itemView.setOnClickListener(this);
        viewHolder = new ViewHolderZoidberg(itemView);
        return viewHolder;
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "CLICK!", Toast.LENGTH_SHORT).show();
    }
}
