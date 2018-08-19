package com.zy.java;

import java.util.HashMap;

public class TestHello {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa",1);
        map.put("bbb",2);
        map.put("ccc",3);

        System.out.println(map.get("bbb"));

        map.remove("ccc");


    }


}
