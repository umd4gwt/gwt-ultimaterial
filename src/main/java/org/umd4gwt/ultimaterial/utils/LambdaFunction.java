package org.umd4gwt.ultimaterial.utils;

/**
 * 函数接口，用于定义一个不带参数且无返回值的lambda函数
 *
 * @author fushuwei
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html">Lambda Expressions</a>
 */
@FunctionalInterface
public interface LambdaFunction {

    /**
     * 执行lambda函数
     */
    void apply();
}
