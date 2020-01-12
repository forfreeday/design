package com.liukai.design.factory.general.tes1;

public class Factory {
    public Send getFactory(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }
        if ("message".equals(type)) {
            return new MessageSender();
        }
        return null;
    }
}


