package com.luoys.onepiece;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.luoys.onepiece.testapi.Hello;

import java.util.Random;

@SpringBootTest
public class OnepieceApplicationTests {

    private MockMvc mvc;

//    @Before
//    public void setup() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new Hello()).build();
//    }

    @Test
    public void Test1() {
        Random rd = new Random();
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        int num = rd.nextInt(9);
        long num1 = 90000000000000l + currentTime;
        System.out.println(num1 + num);

    }

    @Test
    public void test2() {
        long num = NumberSender.createToolId();
        System.out.println(num);
    }

    @Test
    public void test3() {
        NewThread newThread1 = new NewThread("ThreadA");
        NewThread newThread2 = new NewThread("ThreadB");
        NewThread newThread3 = new NewThread("ThreadC");
        Thread thread1 = new Thread(newThread1);
        Thread thread2 = new Thread(newThread2);
        Thread thread3 = new Thread(newThread3);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(30000l);
        } catch (InterruptedException e) {
            System.out.println("exception");
        }
        System.out.println("end");
        Assert.assertTrue(true);
    }

    @Test
    public void test4() {
        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();

        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            System.out.println("exception");
        }

    }

}
