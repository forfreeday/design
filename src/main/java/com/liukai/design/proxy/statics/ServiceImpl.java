package com.liukai.design.proxy.statics;

/**
 * 功能描述：实现类
 *
 * @author liukai
 * @version 1.0
 * @date 2015年11月13日 下午3:47:27
 */
class ServiceImpl implements UserService {
    public ServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void say() {
        System.out.println("ServiceImpl.say()");
    }
}


