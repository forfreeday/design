package com.liukai.design.proxy.dyn;



public class StoryBookFacadeImpl implements BookFacade {
       @Override
       public void addBook() {
               System.out.println("StoryBookFacadeImpl 实现类动态代理开始");
       }
}