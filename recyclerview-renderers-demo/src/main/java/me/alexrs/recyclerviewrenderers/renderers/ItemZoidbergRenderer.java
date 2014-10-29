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
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
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
