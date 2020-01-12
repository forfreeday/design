package com.liukai.design.proxy.statics;

/**
 * 功能描述：代理类
 *
 * @author liukai
 * @version 1.0
 * @date 2015年11月13日 下午3:47:19
 */
public class Proxy implements UserService {
    private UserService iService;

    public Proxy() {
    }

    public Proxy(UserService iService) {
        this.iService = iService;
    }


    @Override
    public void say() {
        System.out.println("Proxy.say()");
        iService.say();
    }

    public static UserService getInstance(ServiceImpl object) {
        return new Proxy(object);
    }
}

