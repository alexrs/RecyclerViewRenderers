package me.alexrs.recyclerviewrenderers.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import me.alexrs.recyclerviewrenderers.factory.Factory;
import me.alexrs.bender.demo.R;
import me.alexrs.recyclerviewrenderers.items.ItemBender;
import me.alexrs.recyclerviewrenderers.items.ItemFry;
import me.alexrs.recyclerviewrenderers.items.ItemZoidberg;
import me.alexrs.recyclerviewrenderers.adapter.RendererAdapter;
import me.alexrs.recyclerviewrenderers.builder.RendererBuilder;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;


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
