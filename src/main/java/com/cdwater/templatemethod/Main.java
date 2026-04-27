package com.cdwater.templatemethod;

/**
 * 模板方法模式演示
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        AbstractClass class3 = new ConcreteClass3();

        System.out.println("=== 具体类1执行模板方法 ===");
        class1.templateMethod();

        System.out.println("\n=== 具体类2执行模板方法 ===");
        class2.templateMethod();

        System.out.println("\n=== 具体类3执行模板方法 ===");
        class3.templateMethod();
    }
}
