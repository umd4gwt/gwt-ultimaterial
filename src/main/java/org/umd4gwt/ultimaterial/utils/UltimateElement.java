package org.umd4gwt.ultimaterial.utils;

import elemental2.dom.HTMLElement;
import org.umd4gwt.ultimaterial.core.BaseUltimateElement;

/**
 * A utility class for working with DOM elements that extends the capabilities of {@link BaseUltimateElement}.
 *
 * @author fushuwei
 */
public class UltimateElement<E extends HTMLElement> extends BaseUltimateElement<E, UltimateElement<E>> {

    private final E wrappedElement;

    /**
     * Constructs a new {@link UltimateElement} with the specified DOM element.
     *
     * @param element The DOM element to wrap.
     */
    public UltimateElement(E element) {
        this.wrappedElement = element;
    }

    /**
     * Gets the wrapped DOM element.
     *
     * @return The wrapped DOM element.
     */
    @Override
    public E element() {
        return wrappedElement;
    }
}
