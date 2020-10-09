package com.carry.设计模式.单例.双重检测;


/**
 * description:  
 * @version 1.0
 * @author carry.wu
 * @date 2020/10/9 13:34
 */
public class DubboCheckSingleClass {


}

 class Singleton {


     private Singleton() {

     }

     private static volatile Singleton SINGLETON = null;


     public static Singleton getInstance() {
         if (SINGLETON == null) {
             synchronized (Singleton.class) {
                 if (SINGLETON == null) {
                     SINGLETON = new Singleton();
                 }
             }
         }
         return SINGLETON;
     }
 }
