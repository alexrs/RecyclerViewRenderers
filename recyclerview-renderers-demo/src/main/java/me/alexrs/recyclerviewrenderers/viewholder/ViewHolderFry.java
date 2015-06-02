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
package me.alexrs.recyclerviewrenderers.viewholder;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.items.ItemFry;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public class ViewHolderFry extends RenderViewHolder<ItemFry> {

    @InjectView(R.id.button)
    Button button;

    public ViewHolderFry(View itemView) {
        super(itemView);
        ButterKnife.inject(this, itemView);
    }

    @OnClick(R.id.button)
    public void performClick(View view) {
        getItem().getItemListener().onClick(getAdapterPosition());
    }

    @Override
    public void onBindView(ItemFry renderable) {
    }
}
