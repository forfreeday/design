package com.liukai.design.proxy;

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
        IService iService = Proxy.getInstance(serviceImpl);
        iService.say();
    }
}


/**
 * 功能描述：代理类
 *
 * @author liukai
 * @version 1.0
 * @date 2015年11月13日 下午3:47:19
 */
class Proxy implements IService {
    private IService iService;

    public Proxy() {
    }

    public Proxy(IService iService) {
        this.iService = iService;
    }


    @Override
    public void say() {
        System.out.println("Proxy.say()");
        iService.say();
    }

    public static IService getInstance(ServiceImpl object) {
        return new Proxy(object);
    }
}

/**
 * 功能描述：实现类
 *
 * @author liukai
 * @version 1.0
 * @date 2015年11月13日 下午3:47:27
 */
class ServiceImpl implements IService {
    public ServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void say() {
        System.out.println("ServiceImpl.say()");
    }
}


/**
 * 功能描述：接口
 *
 * @author liukai
 * @version 1.0
 * @date 2015年11月13日 下午3:47:06
 */
interface IService {
    public abstract void say();
}

