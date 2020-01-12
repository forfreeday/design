package com.liukai.design.proxy;


import java.lang.reflect.Modifier;

/**
 * 获取类的修改符
 *
 * @author liu kai
 * @since 2019-11-23 14:48
 */
public class ModifierTest {

    public static void main(String[] args) {
        Class cl = String.class;
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0) {
            System.out.print(modifiers + " ");
        }
    }
}
