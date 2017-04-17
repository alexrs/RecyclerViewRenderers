RecyclerViewRenderers
=====================
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-RecyclerViewRenderers-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1086)

![image](art/Screenshot.png)

Creating adapters each time you want to use a `RecyclerView` is boring. Everybody knows it.
Also, creating an adapter that accepts different types of data, with its corresponding views, and manage them generates adapters with lines and lines of code that are difficult to maintain.

`RecyclerViewRenderers` is a library whose main objective is to reduce the time you spend fighting against `RecyclerView`	.

It has been designed to help you have your code separated and decoupled.

Thanks to [Sefford](https://github.com/Sefford) for his great library [Brender](https://github.com/Sefford/brender), that has inspired me to write this one.

#### Download
```GROOVY
compile 'me.alexrs:recyclerview-renderers:1.0.4'
```

## Usage
First, we have to declare a RecyclerView in the layout:
```XML
<android.support.v7.widget.RecyclerView
	android:id="@+id/recyclerView"
	android:layout_width="match_parent"
	android:layout_height="match_parent" />
```
Then, in the Activity or Fragment:
```JAVA
RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

//If we are going to have different items, we have to indicate it
recyclerView.setHasFixedSize(false);

//LayoutManager
LinearLayoutManager layoutManager = new LinearLayoutManager(this);
layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
recyclerView.setLayoutManager(layoutManager);

//Adapter (Where magic happens!)
RendererAdapter adapter = new RendererAdapter(items, new RendererBuilder(new Factory()));
recyclerView.setAdapter(adapter);
```

#### Renderables
This classes should contain the data and must implement Renderable. The method `getRenderableId` returns the ID of the layout that will display the data.

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
#### ViewHolder

The `ViewHolder` pattern was used in ListViews to recycle the views and reduce the usage of `findViewById`. In the new `RecyclerView` the `ViewHolder` is used to indicate the `Adapter` how to set the data to the views.
You can indicate here the action that should be performed when this item is clicked in the `RecyclerView` and you can also use [ButterKnife](https://github.com/JakeWharton/butterknife)!  

```JAVA
public class ViewHolderBender extends RenderViewHolder<ItemBender> implements View.OnClickListener {

    @InjectView(R.id.title)
    TextView title;
    @InjectView(R.id.summary)
    TextView summary;

    public ViewHolderBender(View itemView) {
        super(itemView);
        ButterKnife.inject(this, itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onBindView(ItemBender renderable) {
        title.setText(renderable.getTitle());
        summary.setText(renderable.getSummary());
    }
    
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), OtherClass.class);
        getContext().startActivity(intent);
    }

}
```

#### Renderer
The `Renderer` is the class responsible for creating the `ViewHolder` of each `Renderable`. The method `onCreateViewHolder` should return the `ViewHolder`.

```JAVA
public class ItemBenderRenderer extends Renderer {


    public ItemBenderRenderer(int id) {
        super(id);
    }

    @Override
    public RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(id, viewGroup, false);
        return new ViewHolderBender(itemView);
    }
}
```

#### Factory
You have to create a class that implements `RendererFactory`. The method `getRenderer` will be implemented. It will receive as parameter the id of the layout returned by `getRenderableId` in your `Renderable`.  

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
#### TODO
* Test

License
-------
	Copyright (C) 2014 Alejandro Rodriguez Salamanca.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	   http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
