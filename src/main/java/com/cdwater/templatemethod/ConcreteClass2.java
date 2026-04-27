package com.cdwater.templatemethod;

/**
 * 具体类2
 */
public class ConcreteClass2 extends AbstractClass {

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类2 - 步骤1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类2 - 步骤2");
    }

    @Override
    protected void primitiveOperation3() {
        System.out.println("具体类2 - 步骤3");
    }
}
