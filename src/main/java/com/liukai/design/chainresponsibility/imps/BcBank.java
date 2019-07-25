package com.liukai.design.chainresponsibility.imps;


import com.liukai.design.chainresponsibility.handler.PaymentTypeHandler;

/**
 * Created by kayle on 2017/3/10.
 */
public class BcBank extends PaymentTypeHandler {
    public BcBank() {
    }

    public BcBank(PaymentTypeHandler paymentTypeHandler) {
        super(paymentTypeHandler);
    }

    protected String getType() {
        return "BcBank";
    }

    protected void handler() {
        System.out.println("BcBank....Done.");
    }
}
