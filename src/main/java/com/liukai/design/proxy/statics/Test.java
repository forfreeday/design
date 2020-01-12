package com.liukai.design.proxy.statics;

/**
 * 功能描述：测试
 *
 * @author liukai
 * @version 1.0
 * @date 2015年11月13日 下午3:47:33
 */
public class Test {
    public static void main(String[] args) {
        ServiceImpl serviceImpl = new ServiceImpl();
        UserService iService = Proxy.getInstance(serviceImpl);
        iService.say();
    }
}

