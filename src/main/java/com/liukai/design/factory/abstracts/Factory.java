package com.liukai.design.factory.abstracts;

/**
 * Created by kayle on 16/8/29.
 */
public class Factory extends AbstractFactory {

    public AbstractProductA createAbstractProductA() {
        return new ProductA();
    }

    public AbstractProductB createAbstractProductB() {
        return new ProductB();
    }
}