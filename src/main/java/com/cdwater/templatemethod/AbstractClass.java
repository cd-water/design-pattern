package com.cdwater.templatemethod;

/**
 * 抽象类：定义算法骨架
 */
public abstract class AbstractClass {

    /**
     * 模板方法：定义算法流程
     */
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
    }

    /**
     * 抽象方法：由子类实现
     */
    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    protected abstract void primitiveOperation3();
}
