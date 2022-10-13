package com.fastcampus.jpa.bookmanger.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloWorld() throws Exception{
                                                //get으로 접속되는 부분 테스트
                //요청을 전송하는 역할
        mockMvc.perform(MockMvcRequestBuilders.get("/hello-world"))
                .andDo(print())//요청/응답 전체 메세지를 확인
                .andExpect(status().isOk())//andExpect 응답을 검증
                .andExpect(content().string("Hello World"));//응답에 대한 정보를 검증
    }

}