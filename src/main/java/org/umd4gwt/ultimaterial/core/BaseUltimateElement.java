package org.umd4gwt.ultimaterial.core;

import elemental2.dom.Element;
import org.jboss.elemento.IsElement;

/**
 * 这是所有UMD组件的基本实现, 该类提供与任何组件交互的通用行为和函数, 还可以将任何html元素包装成UMD组件
 *
 * @author fushuwei
 */
public abstract class BaseUltimateElement<E extends Element, T extends IsElement<E>> implements IsElement<E> {
}
