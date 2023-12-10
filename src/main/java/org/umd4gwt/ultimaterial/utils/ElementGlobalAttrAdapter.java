package org.umd4gwt.ultimaterial.utils;

import elemental2.dom.CSSStyleDeclaration;
import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * HTML元素全局属性适配器
 *
 * @author fushuwei
 * @see <a href="https://developer.mozilla.org/zh-CN/docs/Web/HTML/Global_attributes">HTML全局属性</a>
 */
@JsType(isNative = true, name = "Element", namespace = JsPackage.GLOBAL)
public class ElementGlobalAttrAdapter extends Element {

    /* 设置激活元素的快捷键 */
    public String accessKey;

    /* 控制文本输入是否自动大写 */
    public String autocapitalize;

    /* 页面加载时, 元素是否自动聚焦 */
    public String autofocus;

    /* 为元素指定css样式表中的类名, 有多个类名时用空格分隔 */
    public String cssClass;

    /* 元素是否可被用户编辑 */
    public String contenteditable;

    /* 元素中文本的方向 */
    public String dir;

    /* 元素是否可以使用 Drag and Drop API 拖动 */
    public String draggable;

    /* 表示该元素还没有，或者不再相关 */
    public String hidden;

    /* 唯一标识符 */
    public String id;

    /* 惰性属性, 使浏览器忽略元素的用户输入事件 */
    public String inert;

    /* 指定元素内容的语言 */
    public String lang;

    /* 元素的行内样式 */
    public CSSStyleDeclaration style;

    /* 元素的 tab 键顺序 */
    public String tabindex;

    /* 元素的额外信息 */
    public String title;
}
