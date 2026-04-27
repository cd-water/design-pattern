package com.cdwater.singleton;

/**
 * 单例模式演示
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("========== 单例模式演示 ==========\n");

        // 饿汉式单例
        System.out.println("=== 饿汉式单例 ===");
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("是否为同一实例: " + (eager1 == eager2));
        eager1.doSomething();

        // 懒汉式单例
        System.out.println("\n=== 懒汉式单例 ===");
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("是否为同一实例: " + (lazy1 == lazy2));
        lazy1.doSomething();

        // 双重检查锁单例
        System.out.println("\n=== 双重检查锁单例 ===");
        DoubleCheckSingleton dcl1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton dcl2 = DoubleCheckSingleton.getInstance();
        System.out.println("是否为同一实例: " + (dcl1 == dcl2));
        dcl1.doSomething();

        // 静态内部类单例
        System.out.println("\n=== 静态内部类单例 ===");
        StaticInnerSingleton inner1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton inner2 = StaticInnerSingleton.getInstance();
        System.out.println("是否为同一实例: " + (inner1 == inner2));
        inner1.doSomething();

        // 枚举单例
        System.out.println("\n=== 枚举单例 ===");
        EnumSingleton enum1 = EnumSingleton.INSTANCE;
        EnumSingleton enum2 = EnumSingleton.INSTANCE;
        System.out.println("是否为同一实例: " + (enum1 == enum2));
        enum1.doSomething();
    }
}
