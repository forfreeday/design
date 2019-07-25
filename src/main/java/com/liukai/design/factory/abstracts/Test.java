package com.liukai.design.factory.abstracts;

/**
 * Created by kayle on 16/8/29.
 */
public class Test {

    public static void main(String[] args) {

        // Factory 工厂是对抽象工厂的进一步实现
        AbstractFactory factory = new Factory();
        AbstractProductA a = factory.createAbstractProductA();
        AbstractProductB b = factory.createAbstractProductB();
        a.run();
        a.create();



        //直接使用抽象工厂
        AbstractProductA productA = factory.getAbstractA();
        productA.create();
    }
}
