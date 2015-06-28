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
package me.alexrs.recyclerviewrenderers.builder;

import me.alexrs.recyclerviewrenderers.interfaces.Builder;
import me.alexrs.recyclerviewrenderers.interfaces.RendererFactory;
import me.alexrs.recyclerviewrenderers.renderer.Renderer;

/**
 * @author Alejandro Rodrigiez (https://github.com/Alexrs95)
 *
 *         Builder that return the Renderer to display
 */
public class RendererBuilder implements Builder {

  /**
   * Factory that provide the Renderer
   */
  private RendererFactory factory;

  /**
   * id of the layout
   */
  private int id;

  public RendererBuilder(RendererFactory factory) {
    this.factory = factory;
  }

  @Override
  public Renderer create() {
    return factory.getRenderer(id);
  }

  @Override
  public Builder instantiate(int id) {
    this.id = id;
    return this;
  }
}
