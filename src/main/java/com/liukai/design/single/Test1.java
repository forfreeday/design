package com.liukai.design.single;

import com.liukai.design.single.doublecheck.Hungry;

/**
 * Created by kayle on 16/8/27.
 */
public class Test1 {
    public static void main(String[] args) {
        Hungry hungry = Hungry.getInstance();
    }

    private void test1() {
        System.out.println("test1");
    }
}
