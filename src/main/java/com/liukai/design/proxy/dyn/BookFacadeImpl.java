package com.liukai.design.proxy.dyn;



public class BookFacadeImpl implements BookFacade {
       @Override
       public void addBook() {
           System.out.println("BookFacadeImpl 实现类动态代理开始");
       }
}