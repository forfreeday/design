package com.liukai.design.factory.abstracts;

/**
 * Created by kayle on 16/8/29.
 * 抽象工厂
 * N 个产品族，在抽象工厂中就有n个创建方法
 */
public abstract class AbstractFactory {

    // A 产品族的工厂
    public abstract AbstractProductA createAbstractProductA();

    // B 产品族的工厂
    public abstract AbstractProductB createAbstractProductB();




    public AbstractProductA getAbstractA() {
        return new ProductA();
    }

    public AbstractProductB getAbstractB() {
        return new ProductB();
    }
}
