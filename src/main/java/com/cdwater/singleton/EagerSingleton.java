package com.cdwater.singleton;

/**
 * 饿汉式单例
 * 特点：类加载时立即初始化，线程安全
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("饿汉式单例 - 执行操作");
    }
}
