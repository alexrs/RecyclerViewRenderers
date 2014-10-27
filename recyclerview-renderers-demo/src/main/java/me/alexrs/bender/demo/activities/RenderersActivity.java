package me.alexrs.bender.demo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.alexrs.bender.demo.Factory;
import me.alexrs.bender.demo.R;
import me.alexrs.bender.demo.items.ItemBender;
import me.alexrs.bender.demo.items.ItemFry;
import me.alexrs.bender.demo.items.ItemZoidberg;
import me.alexrs.bender.lib.adapter.RendererAdapter;
import me.alexrs.bender.lib.builder.RendererBuilder;
import me.alexrs.bender.lib.interfaces.Renderable;


public class RenderersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_bender);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(false);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        RendererAdapter adapter = new RendererAdapter(createItems(), new RendererBuilder(new Factory()));
        recyclerView.setAdapter(adapter);

    }

    private List<Renderable> createItems() {
        List<Renderable> items = new ArrayList<Renderable>();
        for (int i = 0; i < 100; i++) {
            items.add(new ItemBender("Fry: I've got no home, no family...", "Bender: No friends."));
            items.add(new ItemBender("Fry: I've got no home, no family...", "Bender: No friends."));
            items.add(new ItemFry());
            items.add(new ItemBender("Fry: I've got no home, no family...", "Bender: No friends."));
            items.add(new ItemZoidberg("Dr. Zoidberg: Hooray!"));
            items.add(new ItemFry());
        }
        return items;
    }

}
