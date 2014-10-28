package me.alexrs.recyclerviewrenderers.viewholder;

import android.view.View;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import me.alexrs.bender.demo.R;
import me.alexrs.recyclerviewrenderers.items.ItemBender;

/**
 * @author Alejandro on 27/10/14.
 */
public class ViewHolderBender extends RenderViewHolder<ItemBender> {

    @InjectView(R.id.title)
    TextView title;
    @InjectView(R.id.summary)
    TextView summary;

    public ViewHolderBender(View itemView) {
        super(itemView);
        ButterKnife.inject(this, itemView);
    }

    @Override
    public void onBindView(ItemBender benderable) {
        title.setText(benderable.getTitle());
        summary.setText(benderable.getSummary());
    }
}
