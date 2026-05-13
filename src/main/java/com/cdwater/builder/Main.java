package com.cdwater.builder;

/**
 * 构建者模式演示
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 构建者模式演示 ===\n");

        // 使用Builder构建完整对象
        System.out.println("=== 构建完整对象 ===");
        Object object1 = new Object.Builder()
                .property1("值1")
                .property2("值2")
                .property3("值3")
                .build();
        System.out.println(object1);

        // 使用Builder构建部分对象
        System.out.println("\n=== 构建部分对象 ===");
        Object object2 = new Object.Builder()
                .property1("值1")
                .property3("值3")
                .build();
        System.out.println(object2);

        // 链式调用演示
        System.out.println("\n=== 链式调用演示 ===");
        Object object3 = new Object.Builder()
                .property1("属性1的值")
                .property2("属性2的值")
                .build();
        System.out.println(object3);

        System.out.println("\n=== 演示结束 ===");
    }
}