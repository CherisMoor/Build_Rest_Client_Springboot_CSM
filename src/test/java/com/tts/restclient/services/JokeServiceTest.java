package com.tts.restclient.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class JokeServiceTest {

    @Autowired
    private JokeService service;

    @Test
    void testGetJoke(){
        String joke = service.getJoke("Cherish", "Moore");
        assertTrue(joke.contains("Cherish") || joke.contains("Moore"));
    }
}