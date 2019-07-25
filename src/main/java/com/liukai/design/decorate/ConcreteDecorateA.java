package com.liukai.design.decorate;

/**
 * Title:
 * Description:
 *
 * @author liu kai
 * @date 2018/6/21 11:40.
 */
public class ConcreteDecorateA extends Decorate{

    public void Operation() {
        System.out.println("ConcreteDecorateA 对 Component 进行增强");
        addedBehavior();
        super.Operation();
    }


    //装饰类B自有方法
    private void addedBehavior() {

        System.out.println("ConcreteDecorateA 自有方法 - 功能增强");
    }
}
