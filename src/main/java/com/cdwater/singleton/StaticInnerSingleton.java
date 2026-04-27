package com.cdwater.singleton;

/**
 * 静态内部类单例
 * 特点：延迟加载，线程安全，推荐使用
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    private static class Holder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("静态内部类单例 - 执行操作");
    }
}
