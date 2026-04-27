package com.cdwater.singleton;

/**
 * 懒汉式单例（线程安全）
 * 特点：延迟加载，第一次调用时初始化
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("懒汉式单例 - 执行操作");
    }
}
