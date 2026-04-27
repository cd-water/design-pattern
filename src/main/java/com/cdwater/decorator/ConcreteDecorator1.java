package com.cdwater.decorator;

/**
 * 具体装饰器1
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("装饰器1 - 前置增强");
        component.operation();
        System.out.println("装饰器1 - 后置增强");
    }
}
