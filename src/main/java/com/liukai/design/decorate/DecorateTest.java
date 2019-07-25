package com.liukai.design.decorate;

/**
 * Title: 装饰模式测试
 * Description:
 *
 * @author liu kai
 * @date 2018/6/11 13:25.
 */
public class DecorateTest {


    public static void main(String[] args) {

        //创建一个需要增强的对象
        Component component = new ConcreteComponent();
        //创建一个装饰类
        ConcreteDecorateA concreteDecorateA = new ConcreteDecorateA();
        concreteDecorateA.setComponent(component);

        //装饰
        concreteDecorateA.Operation();
    }
}
