package com.liukai.design.chainresponsibility;


import com.liukai.design.chainresponsibility.handler.PaymentTypeHandler;
import com.liukai.design.chainresponsibility.imps.BcBank;
import com.liukai.design.chainresponsibility.imps.CcbBank;
import com.liukai.design.chainresponsibility.imps.IcbcBank;

/**
 * Created by kayle on 2017/3/10.
 */
public class Main {

    public static void main(String[] args) {
        PaymentTypeHandler bcBankHandler = new BcBank();
        PaymentTypeHandler ccbBankHandler = new CcbBank();
        PaymentTypeHandler icbcBankHandler = new IcbcBank();
        //组装责任链
        bcBankHandler.setPaymentTypeHandler(ccbBankHandler);
        ccbBankHandler.setPaymentTypeHandler(icbcBankHandler);

        bcBankHandler.pay("IcbcBank");
    }
}
