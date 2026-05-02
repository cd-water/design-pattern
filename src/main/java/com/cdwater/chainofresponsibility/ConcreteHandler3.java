package com.cdwater.chainofresponsibility;

/**
 * 具体处理者3
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 8) {
            System.out.println("具体处理者3处理了请求：" + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("无人能够处理该请求：" + request);
        }
    }
}