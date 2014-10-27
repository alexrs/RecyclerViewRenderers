package me.alexrs.bender.lib.interfaces;

import android.support.annotation.LayoutRes;

/**
 * @author Alejandro on 02/09/14.
 */
public interface Renderable {

    /**
     * @return the ID of the Layout to inflate
     */
    @LayoutRes
    int getBenderableId();
}
