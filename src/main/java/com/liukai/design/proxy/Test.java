package com.liukai.design.proxy;

import com.liukai.design.proxy.dyn.BookFacadeImpl;

/**
 * TODO
 *
 * @author liu kai
 * @since 2019-11-23 11:35
 */
public class Test {

    public static void main(String[] args) {
        BodyTest bodyTest = new BodyTest();
        BookFacadeImpl bookFacade = new BookFacadeImpl();
        Class<?>[] interfaces = bookFacade.getClass().getInterfaces();


        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}
