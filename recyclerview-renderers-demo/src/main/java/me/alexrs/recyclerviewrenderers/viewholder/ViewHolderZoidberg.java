package me.alexrs.recyclerviewrenderers.viewholder;

import android.view.View;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.alexrs.recyclerviewrenderers.demo.R;
import me.alexrs.recyclerviewrenderers.items.ItemZoidberg;

/**
 * @author Alejandro on 27/10/14.
 */
public class ViewHolderZoidberg extends RenderViewHolder<ItemZoidberg> {
    @InjectView(R.id.textView)
    TextView title;

    public ViewHolderZoidberg(View itemView) {
        super(itemView);
        ButterKnife.inject(this, itemView);
    }

    @Override
    public void onBindView(ItemZoidberg item) {
        title.setText(item.getTitle());
    }
}
