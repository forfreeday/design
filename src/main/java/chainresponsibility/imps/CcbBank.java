package chainresponsibility.imps;

import chainresponsibility.handler.PaymentTypeHandler;

/**
 * Created by kayle on 2017/3/10.
 */
public class CcbBank extends PaymentTypeHandler {
    public CcbBank() {
    }

    public CcbBank(PaymentTypeHandler paymentTypeHandler) {
        super(paymentTypeHandler);
    }

    protected String getType() {
        return "CcbBank";
    }

    protected void handler() {
        System.out.println("CcbBank...Done");
    }
}
