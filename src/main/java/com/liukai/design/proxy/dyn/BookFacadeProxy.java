package com.liukai.design.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
* JDK动态代理代理类
*  
* @author liu kai
*  
*/  
public class BookFacadeProxy implements InvocationHandler {

   private Object target;

   /**
    * 1.绑定委托对象并返回一个代理类
    * @param target
    * @return
    */  
   public Object bind(Object target) {  
       this.target = target;  
       //取得代理对象  
       return Proxy.newProxyInstance(target.getClass().getClassLoader(),
               target.getClass().getInterfaces(), this);   //要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)  
   }  
 

   /**
    * 2.调用方法 ，这个实现方法并不是用户调用的，需要实现组Proxy类进行调用。
    */
   @Override
   public Object invoke(Object proxy, Method method, Object[] args)
           throws Throwable {  
       System.out.println("事物开始");
       //执行方法  
       Object result = method.invoke(target, args);
       System.out.println("事物结束");  
       return result;  
   }  
}  
