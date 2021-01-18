package com.EC.webApp.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)



public class readValues {


    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate testTemplate;  // will have the entire home page
    @Test
    public void shouldReturnDefaultValueOfVersion(){             //     url         the result type
        String renderThePage= this.testTemplate.getForObject("http://localhost:"+port,String.class);  // page changed to string

        assertTrue(renderThePage.contains("3.0.0"));


    }

}
