package com.wyw.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/4/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void getAge() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/girls/age/5")).andExpect(MockMvcResultMatchers.status().isOk());
        //mvc.perform(MockMvcRequestBuilders.get("/girls/age/5")).andExpect(MockMvcResultMatchers.content().string("aaa"))
    }

}