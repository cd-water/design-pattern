package com.cdwater.decorator;

/**
 * 具体组件
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("具体组件 - 执行操作");
    }
}
