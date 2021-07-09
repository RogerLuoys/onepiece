package com.luoys.onepiece;

import org.junit.Test;

public class StringTest {

    @Test
    public void test1() {
        String t1 = "1234567";
        String t2 = t1.replace("1", "$$$");
        System.out.println(t1 +"\n"+t2);
    }
}
