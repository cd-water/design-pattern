package com.cdwater.decorator;

/**
 * 具体装饰器2
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("装饰器2 - 前置增强");
        component.operation();
        System.out.println("装饰器2 - 后置增强");
    }
}
