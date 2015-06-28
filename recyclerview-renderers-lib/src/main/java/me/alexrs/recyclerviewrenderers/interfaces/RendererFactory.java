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
package me.alexrs.recyclerviewrenderers.interfaces;

import me.alexrs.recyclerviewrenderers.renderer.Renderer;

/**
 * @author Alejandro Rodriguez (https://github.com/Alexrs95)
 *
 *         Interface that defines the implementation of the factory that return the renderer
 */
public interface RendererFactory {

  /**
   * @param id the ID of the layout
   * @return the Renderer assigned to the layout
   */
  Renderer getRenderer(int id);
}
