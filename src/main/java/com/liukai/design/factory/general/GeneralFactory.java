package com.liukai.design.factory.general;

/**
 * Created by kayle on 16/8/27.
 * 普通工厂模式
 */
public class GeneralFactory {

    //获取工厂
    public MessageFactory getFactory (String type) {
        if (type.equals("phone")) {
            return new PhoneMessageFactory();
        } else if (type.equals("router")) {
            return new RouterMessageFactory();
        } else {
            try {
                throw new Exception("找不到工厂");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
