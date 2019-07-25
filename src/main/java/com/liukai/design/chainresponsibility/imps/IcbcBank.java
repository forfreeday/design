package com.liukai.design.chainresponsibility.imps;

import com.liukai.design.chainresponsibility.handler.PaymentTypeHandler;

/**
 * Created by kayle on 2017/3/10.
 */
public class IcbcBank extends PaymentTypeHandler{
    public IcbcBank() {
    }

    public IcbcBank(PaymentTypeHandler paymentTypeHandler) {
        super(paymentTypeHandler);
    }

    protected String getType() {
        return "IcbcBank";
    }

    protected void handler() {
        System.out.println("IcbcBank...Done.");
    }
}
