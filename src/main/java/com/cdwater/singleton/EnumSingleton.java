package com.cdwater.singleton;

/**
 * 枚举单例
 * 特点：最安全的单例实现，防止反射和序列化破坏
 */
public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("枚举单例 - 执行操作");
    }
}
