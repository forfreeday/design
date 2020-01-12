package com.liukai.design.factory.general.tes1;

//测试类
public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Send send = factory.getFactory("message");
        send.sendMessage();
    }
}
