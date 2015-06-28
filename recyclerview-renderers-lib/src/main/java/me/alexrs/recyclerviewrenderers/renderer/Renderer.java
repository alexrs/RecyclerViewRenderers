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
package me.alexrs.recyclerviewrenderers.renderer;

import android.view.ViewGroup;
import me.alexrs.recyclerviewrenderers.viewholder.RenderViewHolder;

/**
 * @author Alejandro Rodriguez (https://github.com/Alexrs95)
 */
public abstract class Renderer {

  /**
   * layout ID
   */
  public final int id;

  public Renderer(int id) {
    this.id = id;
  }

  /**
   * Creates the ViewHolder of the Renderer
   *
   * @param viewGroup the container
   * @return an instance of the ViewHolder
   */
  public abstract RenderViewHolder onCreateViewHolder(ViewGroup viewGroup, int id);

  /**
   * @return the ID of the layout
   */
  public int getId() {
    return id;
  }
}
