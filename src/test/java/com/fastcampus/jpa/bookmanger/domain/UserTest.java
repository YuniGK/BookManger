package com.fastcampus.jpa.bookmanger.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test(){
        var user = new User();

        user.setEmail("test@email.com");
        user.setName("yuni");

        System.out.println(">>> "+user);
        System.out.printf(">>> %s", user);
    }

}