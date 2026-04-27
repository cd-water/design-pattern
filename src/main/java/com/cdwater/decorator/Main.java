package com.cdwater.decorator;

/**
 * 装饰器模式演示
 */
public class Main {
    public static void main(String[] args) {
        // 单独使用具体组件
        System.out.println("=== 单独使用具体组件 ===");
        Component component = new ConcreteComponent();
        component.operation();

        // 装饰器1装饰
        System.out.println("\n=== 装饰器1装饰 ===");
        Component decorator1 = new ConcreteDecorator1(component);
        decorator1.operation();

        // 装饰器2装饰
        System.out.println("\n=== 装饰器2装饰 ===");
        Component decorator2 = new ConcreteDecorator2(component);
        decorator2.operation();

        // 组合装饰：装饰器1 + 装饰器2
        System.out.println("\n=== 组合装饰：装饰器1 + 装饰器2 ===");
        Component combinedDecorator = new ConcreteDecorator2(new ConcreteDecorator1(component));
        combinedDecorator.operation();
    }
}
