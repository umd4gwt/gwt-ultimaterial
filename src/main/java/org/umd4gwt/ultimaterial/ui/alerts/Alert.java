package org.umd4gwt.ultimaterial.ui.alerts;

import elemental2.dom.HTMLDivElement;
import org.umd4gwt.ultimaterial.core.BaseUltimateElement;
import org.umd4gwt.ultimaterial.utils.UltimateElement;

/**
 * 警报消息组件
 *
 * @author fushuwei
 */
public class Alert extends BaseUltimateElement<HTMLDivElement, Alert> {

    UltimateElement<HTMLDivElement> element;

    @Override
    public HTMLDivElement element() {
        return element.element();
    }
}
