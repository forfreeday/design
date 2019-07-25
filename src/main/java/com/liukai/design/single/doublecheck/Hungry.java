package com.liukai.design.single.doublecheck;

/**
* 懒汉模式的特点：实例的延迟加载。
* 问题是：多线程时会有同步问题。解决方式：加锁。
*/
public class Hungry {
       
   //1.创建空的对象，用于延迟加载。
   //2.私有化构造器
   //3.给出获取方法。但是为了防止出现线程安全问题，必须采取双得检查加同步代码块的方式进行安全保护机制。
   private static Hungry hungry = null;
   private Hungry(){

   }
   public static Hungry getInstance(){
       if (hungry==null) {
           synchronized (Hungry.class) {
               //这层检查是必须要加的，如果没加，那么另一个线程进来后如果出现抢线程的情况那么对象将会被创建二个。
               if (hungry==null) {
                       hungry = new Hungry();
               }
           }
       }
       return hungry;
   }
}
