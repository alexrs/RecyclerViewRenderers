package me.alexrs.recyclerviewrenderers.adapters;

import java.util.List;
import me.alexrs.recyclerviewrenderers.adapter.RendererAdapter;
import me.alexrs.recyclerviewrenderers.builder.RendererBuilder;
import me.alexrs.recyclerviewrenderers.interfaces.Renderable;

public class CustomRendererAdapter extends RendererAdapter {

  /**
   * @param items List that contains the items to show
   * @param builder Builder that create the Renderers
   */
  public CustomRendererAdapter(List<? extends Renderable> items, RendererBuilder builder) {
    super(items, builder);
  }

  public void setItems(List<Renderable> items) {
    this.items = items;
    notifyDataSetChanged();
  }
}
