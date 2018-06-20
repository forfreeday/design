package chainresponsibility;


import chainresponsibility.handler.PaymentTypeHandler;
import chainresponsibility.imps.BcBank;
import chainresponsibility.imps.CcbBank;
import chainresponsibility.imps.IcbcBank;

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
