package com.liukai.design.proxy.dyn;

public class TestProxy {

   public static void main(String[] args) {  
       BookFacadeProxy proxy = new BookFacadeProxy();
       BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
//       StoryBookFacadeImpl bookProxy1 = (StoryBookFacadeImpl) proxy.bind(new StoryBookFacadeImpl());
       bookProxy.addBook();
//       bookProxy1.addBook();
   }
}