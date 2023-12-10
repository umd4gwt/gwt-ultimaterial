package org.umd4gwt.ultimaterial.utils;

import elemental2.core.JsDate;

/**
 * 用于生成DOM元素唯一ID的工具类
 *
 * @author fushuwei
 */
public final class UniqueId {

    private static final String DEFAULT_PREFIX = "umd-";
    private static int counter = 0;
    private static String SEED;

    private static LazyInitializer seedInit = new LazyInitializer(() -> {
        SEED = new JsDate().getTime() + "-";
    });

    /**
     * Generates a unique DOM element ID with the default prefix "uui-".
     *
     * @return A unique DOM element ID.
     */
    public static String unique() {
        return unique(DEFAULT_PREFIX);
    }

    /**
     * Generates a unique DOM element ID with the specified prefix.
     *
     * @param prefix The prefix to prepend to the generated ID.
     * @return A unique DOM element ID with the specified prefix.
     */
    public static String unique(String prefix) {
        String id = prefix + getSeed() + counter;
        counter++;
        return id;
    }

    private static String getSeed() {
        seedInit.apply();
        return SEED;
    }
}
