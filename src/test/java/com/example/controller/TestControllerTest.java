package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHelloWithoutName() {
        String url = "http://localhost:" + port + "/demo/test/toobit";
//        System.out.println(url);
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(response);
        assertThat(response).isEqualTo("Hello World! ");
    }

    @Test
    public void testHelloWithName() {
        String url = "http://localhost:" + port + "/demo/test/toobit?name=Alice";
//        System.out.println(url);
        String response = restTemplate.getForObject(url, String.class);
        System.out.println(response);
        assertThat(response).isEqualTo("Hello Alice! ");
    }
}