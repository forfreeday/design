package com.liukai.design.proxy.statics;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author liu kai
 * @since 2019-11-22 20:48
 */
public class Test2 {

    public static void main(String args[]) {
        List<String> famous = new ArrayList<String>();
        famous.add("liudehua");
        famous.add("madehua");
        famous.add("liushishi");
        famous.add("tangwei");
        for (String s : famous) {
            if (s.equals("madehua")) {
                famous.remove(s);
            }
        }
    }
}
