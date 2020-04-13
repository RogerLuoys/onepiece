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

@SpringBootTest
public class OnepieceApplicationTests {

    private MockMvc mvc;

    @Before
    public void setup() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new Hello()).build();
    }

    @Test
    public void Test1() {
//        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().)

    }

}
