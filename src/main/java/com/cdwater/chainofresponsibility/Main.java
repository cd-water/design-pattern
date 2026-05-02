package com.cdwater.chainofresponsibility;

/**
 * 责任链模式演示
 */
public class Main {
    public static void main(String[] args) {
        // 创建处理者
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // 设置责任链：处理者1 -> 处理者2 -> 处理者3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        System.out.println("=== 责任链模式演示 ===");
        System.out.println("责任链：具体处理者1(1-3) -> 具体处理者2(4-7) -> 具体处理者3(8+)\n");

        // 测试1
        System.out.println("=== 测试1 ===");
        handler1.handleRequest(1);

        // 测试2
        System.out.println("\n=== 测试2 ===");
        handler1.handleRequest(5);

        // 测试3
        System.out.println("\n=== 测试3 ===");
        handler1.handleRequest(10);

        // 测试4
        System.out.println("\n=== 测试4 ===");
        handler1.handleRequest(0);

        System.out.println("\n=== 演示结束 ===");
    }
}