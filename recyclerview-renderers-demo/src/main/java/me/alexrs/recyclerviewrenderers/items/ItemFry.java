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
package me.alexrs.recyclerviewrenderers.items;

import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.alexrs.recyclerviewrenderers.listeners.ItemListener;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public class ItemFry implements Renderable {
    private ItemListener itemListener;

    public ItemFry(ItemListener itemListener) {
        this.itemListener = itemListener;
    }

    @Override
    public int getRenderableId() {
        return R.layout.item_fry;
    }

    public ItemListener getItemListener() {
        return itemListener;
    }

    public void setItemListener(ItemListener itemListener) {
        this.itemListener = itemListener;
    }
}
