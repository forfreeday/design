package com.liukai.design.chainresponsibility.handler;

/**
 * Created by kayle on 2017/3/10.
 * 责任链
 */
public abstract class PaymentTypeHandler {

    //用于存储下一个节点
    private PaymentTypeHandler paymentTypeHandler;
    public PaymentTypeHandler(){}
    public PaymentTypeHandler(PaymentTypeHandler paymentTypeHandler) {
        this.paymentTypeHandler = paymentTypeHandler;
    }
    public final void pay(String type) {
        System.out.println("parameter type: " + type + ", current type: " +getType());
        if (getType().equals(type)) {       //类型相同，则直接处理
            handler();
            System.out.println("Done..");
        } else {                            //类型不同，则传递到下一个对象去处理
            getPaymentTypeHandler().pay(type);
        }
    }
    //子类实现，用于判断是否符合该handler类型
    protected abstract String getType();
    //子类实现具体的处理逻辑
    protected abstract void handler();

    // setter getter
    public PaymentTypeHandler getPaymentTypeHandler() {
        return paymentTypeHandler;
    }
    public void setPaymentTypeHandler(PaymentTypeHandler paymentTypeHandler) {
        this.paymentTypeHandler = paymentTypeHandler;
    }
}
