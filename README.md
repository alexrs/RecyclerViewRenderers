RecyclerViewRenderers
=====================

![image](art/Screenshot.png)

Creating adapters each time you want to use a RecyclerView is boring. Everybody know it.
Also, creating an adapter that accept different types of data, with its corresponding views, and manage them generates adapters with lines and lines of code and that are difficult to maintain.

RecyclerViewRenderes is a library which main objective is to reduce the time you spend fighting agains RecyclerView.

It has been designed to help you to have your code separated and decoupled.

Thanks to [Sefford](https://github.com/Sefford) for his great library [Brender](https://github.com/Sefford/brender), that has inspired me to write this library.

##Usage
First, we have to declare a RecyclerView in our layout:
```XML
<android.support.v7.widget.RecyclerView
	android:id="@+id/recyclerView"
	android:layout_width="match_parent"
	android:layout_height="match_parent" />
```
Then, in our Activity or Fragment:
```JAVA
RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
```
If we are going to have different items, we have to indicate it:
```JAVA
recyclerView.setHasFixedSize(false);
```
```JAVA
LinearLayoutManager layoutManager = new LinearLayoutManager(this);
layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
recyclerView.setLayoutManager(layoutManager);
```
```JAVA
RendererAdapter adapter = new RendererAdapter(items, new RendererBuilder(new Factory()));
recyclerView.setAdapter(adapter);
```
Items
```JAVA
public class ItemBender implements Renderable {

    private String title;

    private String summary;

    public ItemBender(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public int getRenderableId() {
        return R.layout.item_bender;
    }
}
```
Factory
```JAVA
public class Factory implements RendererFactory {

    @Override
    public Renderer getRenderer(int id) {
        switch (id) {
            case R.layout.item_bender:
                return new ItemBenderRenderer(id);
            case R.layout.item_zoidberg:
                return new ItemZoidbergRenderer(id);
            case R.layout.item_fry:
                return new ItemFryRenderer(id);
        }
        return null;
    }
}
```
Renderer
```JAVA
public class ItemBenderRenderer extends Renderer implements View.OnClickListener {


    public ItemBenderRenderer(int id) {
        super(id);
    }

    @Override
    public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        itemView.setOnClickListener(this);
        return new ViewHolderBender(itemView);
    }

    @Override
    public void onClick(View v) {
        v.getContext().startActivity(new Intent(v.getContext(), DetailActivity.class));
    }
}
```
ViewHolder
```JAVA
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
    public void onBindView(ItemBender renderable) {
        title.setText(renderable.getTitle());
        summary.setText(renderable.getSummary());
    }
}
```

License
-------
	Copyright 2014 Alexrs95.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
