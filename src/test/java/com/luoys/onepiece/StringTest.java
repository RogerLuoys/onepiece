package com.luoys.onepiece;

import com.alibaba.fastjson.JSON;
import com.luoys.onepiece.testapi.DataSourceDTO;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StringTest {

    @Test
    public void test1() {
        String t1 = "1234567";
        String t2 = t1.replace("1", "$$$");
        System.out.println(t1 +"\n"+t2);
    }

    @Test
    public void test2() {
        String t1 = "{\"driver\":\"test driver\",\"password\":\"test password\",\"url\":\"test url\",\"userName\":\"test user name\"} &&& {\"sql\":\"update device set description='auto' where id=1;\",\"type\":3}";
        List<String> sqlList = Arrays.asList(t1.split(" &&& "));
        String t2 = sqlList.get(0);
        System.out.println(t2);
        DataSourceDTO dataSourceDTO = JSON.parseObject(t2, DataSourceDTO.class);
        System.out.println(sqlList);
        System.out.println(dataSourceDTO);
    }

}
