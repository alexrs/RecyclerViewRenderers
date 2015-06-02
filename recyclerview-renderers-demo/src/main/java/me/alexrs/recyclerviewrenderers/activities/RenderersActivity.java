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
package me.alexrs.recyclerviewrenderers.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import butterknife.InjectView;
import java.util.ArrayList;
import java.util.List;
import me.alexrs.recyclerviewrenderers.adapter.RendererAdapter;
import me.alexrs.recyclerviewrenderers.builder.RendererBuilder;
import me.alexrs.recyclerviewrenderers.decorator.DividerItemDecoration;
import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.factory.Factory;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;
import me.alexrs.recyclerviewrenderers.items.ItemBender;
import me.alexrs.recyclerviewrenderers.items.ItemFry;
import me.alexrs.recyclerviewrenderers.items.ItemZoidberg;
import me.alexrs.recyclerviewrenderers.listeners.ItemListener;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public class RenderersActivity extends Activity implements ItemListener {

    @InjectView(R.id.recyclerView)
    RecyclerView recyclerView;

    private RendererAdapter adapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.render, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add:
                adapter.add(new ItemFry(this), 0);
                recyclerView.scrollToPosition(0);
                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_bender);
        ButterKnife.inject(this);

        recyclerView.setHasFixedSize(false);
        recyclerView.addItemDecoration(
            new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RendererAdapter(createItems(), new RendererBuilder(new Factory()));
        recyclerView.setAdapter(adapter);
    }

    private List<Renderable> createItems() {
        List<Renderable> items = new ArrayList<Renderable>();
        for (int i = 0; i < 100; i++) {
            items.add(new ItemBender("Fry: I've got no home, no family...", "Bender: No friends."));
            items.add(new ItemZoidberg("Dr. Zoidberg: Hooray!"));
            items.add(new ItemBender("Fry: I've got no home, no family...", "Bender: No friends."));
            items.add(new ItemFry(this));
            items.add(new ItemBender("Fry: I've got no home, no family...", "Bender: No friends."));
            items.add(new ItemZoidberg("Dr. Zoidberg: Hooray!"));
            items.add(new ItemFry(this));
            items.add(new ItemZoidberg("Dr. Zoidberg: Hooray!"));
        }
        return items;
    }

    @Override
    public void onClick(int position) {
        adapter.removeAt(position);
    }
}
