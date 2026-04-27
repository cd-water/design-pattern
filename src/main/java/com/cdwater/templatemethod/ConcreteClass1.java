package com.cdwater.templatemethod;

/**
 * 具体类1
 */
public class ConcreteClass1 extends AbstractClass {

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类1 - 步骤1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类1 - 步骤2");
    }

    @Override
    protected void primitiveOperation3() {
        System.out.println("具体类1 - 步骤3");
    }
}
