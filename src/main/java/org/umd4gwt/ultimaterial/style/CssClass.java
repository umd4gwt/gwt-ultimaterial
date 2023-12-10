package org.umd4gwt.ultimaterial.style;

import elemental2.dom.Element;
import org.jboss.elemento.IsElement;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Objects.nonNull;

/**
 * CSS类
 *
 * @author fushuwei
 */
public interface CssClass {

    /**
     * Returns the name of the CSS class represented by this instance.
     *
     * @return The name of the CSS class.
     */
    String getCssClass();

    /**
     * Applies the CSS class to the provided {@link IsElement}.
     *
     * @param element The element to which the CSS class will be applied.
     */
    default void apply(IsElement<?> element) {
        apply(element.element());
    }

    /**
     * Applies the CSS class to the provided DOM {@link Element}.
     *
     * @param element The DOM element to which the CSS class will be applied.
     */
    default void apply(Element element) {
        if (!element.classList.contains(getCssClass())) {
            element.classList.add(getCssClass());
        }
    }

    /**
     * Applies the CSS class to a list of DOM {@link Element}s.
     *
     * @param elements The DOM elements to which the CSS class will be applied.
     */
    default void apply(Element... elements) {
        Arrays.asList(elements).forEach(this::apply);
    }

    /**
     * Applies the CSS class to a list of {@link IsElement}s.
     *
     * @param elements The elements to which the CSS class will be applied.
     */
    default void apply(IsElement<?>... elements) {
        Arrays.asList(elements).forEach(this::apply);
    }

    /**
     * Checks if the CSS class is applied to the given DOM {@link Element}.
     *
     * @param element The DOM element to check.
     * @return true if the CSS class is applied, false otherwise.
     */
    default boolean isAppliedTo(Element element) {
        if (nonNull(element)) {
            return element.classList.contains(getCssClass());
        }
        return false;
    }

    /**
     * Checks if the CSS class is applied to the given {@link IsElement}.
     *
     * @param element The element to check.
     * @return true if the CSS class is applied, false otherwise.
     */
    default boolean isAppliedTo(IsElement<?> element) {
        if (nonNull(element)) {
            return isAppliedTo(element.element());
        }
        return false;
    }

    /**
     * Removes the CSS class from the given DOM {@link Element}.
     *
     * @param element The DOM element from which the CSS class will be removed.
     */
    default void remove(Element element) {
        element.classList.remove(getCssClass());
    }

    /**
     * Removes the CSS class from a list of DOM {@link Element}s.
     *
     * @param elements The DOM elements from which the CSS class will be removed.
     */
    default void remove(Element... elements) {
        Arrays.asList(elements).forEach(this::remove);
    }

    /**
     * Removes the CSS class from the given {@link IsElement}.
     *
     * @param element The element from which the CSS class will be removed.
     */
    default void remove(IsElement<?> element) {
        remove(element.element());
    }

    /**
     * Removes the CSS class from a list of {@link IsElement}s.
     *
     * @param elements The elements from which the CSS class will be removed.
     */
    default void remove(IsElement<?>... elements) {
        Arrays.asList(elements).forEach(this::remove);
    }

    /**
     * Compares the current CSS class to another {@link CssClass} to see if they
     * represent the same CSS class name.
     *
     * @param other The other CSS class to compare with.
     * @return true if both represent the same CSS class name, false otherwise.
     */
    default boolean isSameAs(CssClass other) {
        return Objects.equals(getCssClass(), other.getCssClass());
    }

    /**
     * A default implementation of the {@link CssClass} interface that represents an empty or "none" CSS class.
     * This class does not apply any CSS class to an element and always returns an empty string as the CSS class name.
     */
    CssClass NONE = new CssClass() {

        /**
         * Retrieves an empty string as the CSS class name.
         *
         * @return An empty string.
         */
        @Override
        public String getCssClass() {
            return "";
        }

        /**
         * Applies no CSS class to the specified DOM element.
         *
         * @param element The DOM element to which no CSS class is applied.
         */
        @Override
        public void apply(Element element) {
        }

        /**
         * Indicates that no CSS class is applied to the specified DOM element.
         *
         * @param element The DOM element to check for the presence of CSS classes.
         * @return Always returns {@code false}.
         */
        @Override
        public boolean isAppliedTo(Element element) {
            return false;
        }

        /**
         * Indicates that no CSS class is applied to the specified IsElement instance.
         *
         * @param element The IsElement instance to check for the presence of CSS classes.
         * @return Always returns {@code false}.
         */
        @Override
        public boolean isAppliedTo(IsElement<?> element) {
            return false;
        }

        /**
         * Removes no CSS class from the specified DOM element.
         *
         * @param element The DOM element from which no CSS class is removed.
         */
        @Override
        public void remove(Element element) {
        }

        /**
         * Removes no CSS class from the specified IsElement instance.
         *
         * @param element The IsElement instance from which no CSS class is removed.
         */
        @Override
        public void remove(IsElement<?> element) {
        }
    };
}
