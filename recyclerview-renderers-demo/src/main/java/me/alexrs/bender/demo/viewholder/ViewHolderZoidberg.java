package me.alexrs.bender.demo.viewholder;

import android.view.View;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.alexrs.bender.demo.R;
import me.alexrs.bender.demo.items.ItemZoidberg;
import me.alexrs.bender.lib.viewholder.BenderViewHolder;

/**
 * @author Alejandro on 27/10/14.
 */
public class ViewHolderZoidberg extends BenderViewHolder<ItemZoidberg> {
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
