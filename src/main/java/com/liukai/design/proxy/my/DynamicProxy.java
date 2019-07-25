package com.liukai.design.proxy.my;

/**
 * 实现动态代理
 * @author liukai
 * @since 2019/7/17 01:04.
 */
public class DynamicProxy {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.liukai.design.proxy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}


@ProxyFlag
class ProxyTest {

    private void say() {
        System.out.println("ProxyTest.say()");
    }

    private String run() {
        System.out.println("running..");
        return "running";
    }
}

