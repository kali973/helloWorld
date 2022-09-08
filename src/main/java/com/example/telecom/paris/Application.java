package com.example.telecom.paris;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("===> HelloWorld");
        log.info("Application end");
    }
}
