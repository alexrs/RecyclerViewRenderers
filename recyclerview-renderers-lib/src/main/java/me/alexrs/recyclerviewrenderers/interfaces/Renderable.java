package me.alexrs.recyclerviewrenderers.interfaces;

import android.support.annotation.LayoutRes;

/**
 * @author Alejandro Rodriguez <https://github.com/Alexrs95>
 */
public interface Renderable {

    /**
     * @return the ID of the Layout to inflate
     */
    @LayoutRes
    int getRenderableId();
}
